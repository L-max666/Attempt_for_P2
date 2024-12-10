import java.util.HashMap;
import java.util.Map;

public class DigitalTwinManager {
    public static class Feature {
        private Map<String, Object> desired;
        private Map<String, Object> reported;
        private Metadata metadata;

        public Feature() {
            this.desired = new HashMap<>();
            this.reported = new HashMap<>();
            this.metadata = new Metadata();
        }

        public Map<String, Object> getDesired() {
            return desired;
        }

        public Map<String, Object> getReported() {
            return reported;
        }

        public Metadata getMetadata() {
            return metadata;
        }

        public void updateDesired(String property, Object value) {
            this.desired.put(property, value);
            this.metadata.update();
        }

        public void updateReported(String property, Object value) {
            this.reported.put(property, value);
            this.metadata.update();
        }
    }

    public static class Metadata {
        private long revision;
        private String modified;

        public Metadata() {
            this.revision = 0;
            this.modified = null;
        }

        public void update() {
            this.revision++;
            this.modified = java.time.Instant.now().toString();
        }

        public long getRevision() {
            return revision;
        }

        public String getModified() {
            return modified;
        }
    }

    private final Map<String, Feature> features;

    public DigitalTwinManager() {
        this.features = new HashMap<>();
    }

    public Feature getFeature(String featureName) {
        return features.computeIfAbsent(featureName, k -> new Feature());
    }

    public void updateFeatureDesired(String featureName, String property, Object value) {
        Feature feature = getFeature(featureName);
        feature.updateDesired(property, value);
    }

    public void updateFeatureReported(String featureName, String property, Object value) {
        Feature feature = getFeature(featureName);
        feature.updateReported(property, value);
    }
}
