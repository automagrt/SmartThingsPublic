/**
 *  simulated switch and contact sensor
 *
 *  Copyright 2020 ANGELO RICCI
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 */
metadata {
	definition (name: "simulated switch and contact sensor", namespace: "simulated switch and contact sensor", author: "ANGELO RICCI", cstHandler: true) {
		capability "Contact Sensor"
		capability "Switch"

		fingerprint mfr: "0989", prod: "0989", model: "989z", deviceJoinName: "simulated switch and contact sensor"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'contact' attribute
	// TODO: handle 'switch' attribute

}
// handle commands
def on() {
log.debug "Turning Switch and Sensor On"
sendEvent(name: "switch", value: "on", isStateChange: true, display: true, displayed: true)
sendEvent(name: "contact", value: "open", isStateChange: true, display: true, displayed: true)
}

def off() {
log.debug "Turning Switch and Sensor Off"
sendEvent(name: "switch", value: "off", isStateChange: true, display: true, displayed: true)
sendEvent(name: "contact", value: "closed", isStateChange: true, display: true, displayed: true)
}
