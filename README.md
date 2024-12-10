# Attempt_for_P2

This repo is for trying to add a @desire field as metadata for the feature in Eclipse Ditto.
example json feature:
  "thingId": "org.eclipse.ditto:device-1",
  "policyId": "...",
  "features": {
    "lamp": {
      "properties": {
        "desired": {
          "on": true,
          "color": {
            "r": 255,
            "g": 0,
            "b": 0
          }
        },
        "reported": {
          "on": false,
          "color": {
            "r": 0,
            "g": 0,
            "b": 255
          }
        }
      },
      "_metadata": {
        "_revision": 12,
        "_modified": "2024-12-10T10:00:00Z"
      }
    }
  },
  "_created": "2024-01-01T10:00:00Z",
  "_modified": "2024-12-10T10:00:00Z",
  "_revision": 42
}
