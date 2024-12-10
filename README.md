# Attempt_for_P2

This repo is for trying to add a @desire field as metadata for the feature in Eclipse Ditto.


the original thing representation without desired field

{
  "thingId": "io.eclipseprojects.ditto:floor-lamp-0815",
  "policyId": "io.eclipseprojects.ditto:floor-lamp-0815",
  "definition": "https://eclipse-ditto.github.io/ditto-examples/wot/models/floor-lamp-1.0.0.tm.jsonld",
  "attributes": {
    "manufacturer": "",
    "serialNo": ""
  },
  "features": {
    "Spot1": {
      "definition": [
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/dimmable-colored-lamp-1.0.0.tm.jsonld",
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/colored-lamp-1.0.0.tm.jsonld",
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/switchable-1.0.0.tm.jsonld"
      ],
      "properties": {
        "dimmer-level": 0,
        "color": {
          "r": 0,
          "g": 0,
          "b": 0
        },
        "on": false
      }
    },
    "Spot2": {
      "definition": [
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/dimmable-colored-lamp-1.0.0.tm.jsonld",
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/colored-lamp-1.0.0.tm.jsonld",
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/switchable-1.0.0.tm.jsonld"
      ],
      "properties": {
        "dimmer-level": 0,
        "color": {
          "r": 0,
          "g": 0,
          "b": 0
        },
        "on": false
      }
    },
    "Spot3": {
      "definition": [
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/dimmable-colored-lamp-1.0.0.tm.jsonld",
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/colored-lamp-1.0.0.tm.jsonld",
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/switchable-1.0.0.tm.jsonld"
      ],
      "properties": {
        "dimmer-level": 0,
        "color": {
          "r": 0,
          "g": 0,
          "b": 0
        },
        "on": false
      }
    },
    "ConnectionStatus": {
      "definition": [
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/connection-status-1.0.0.tm.jsonld"
      ],
      "properties": {
        "readySince": "",
        "readyUntil": ""
      }
    },
    "PowerConsumptionAwareness": {
      "definition": [
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/power-consumption-aware-1.0.0.tm.jsonld"
      ],
      "properties": {
        "reportPowerConsumption": {}
      }
    },
    "SmokeDetection": {
      "definition": [
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/smoke-detector-1.0.0.tm.jsonld"
      ]
    },
    "Status-LED": {
      "definition": [
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/colored-lamp-1.0.0.tm.jsonld",
        "https://eclipse-ditto.github.io/ditto-examples/wot/models/switchable-1.0.0.tm.jsonld"
      ],
      "properties": {
        "color": {
          "r": 0,
          "g": 0,
          "b": 0
        },
        "on": false
      }
    }
  }
}
