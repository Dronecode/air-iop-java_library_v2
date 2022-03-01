/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/** 
 * Supported component metadata types. These are used in the "general" metadata file returned by COMPONENT_INFORMATION to provide information about supported metadata types. The types are not used directly in MAVLink messages.
 */
public class COMP_METADATA_TYPE {
   public static final int COMP_METADATA_TYPE_GENERAL = 0; /* General information about the component. General metadata includes information about other metadata types supported by the component. Files of this type must be supported, and must be downloadable from vehicle using a MAVLink FTP URI. | */
   public static final int COMP_METADATA_TYPE_PARAMETER = 1; /* Parameter meta data. | */
   public static final int COMP_METADATA_TYPE_COMMANDS = 2; /* Meta data that specifies which commands and command parameters the vehicle supports. (WIP) | */
   public static final int COMP_METADATA_TYPE_PERIPHERALS = 3; /* Meta data that specifies external non-MAVLink peripherals. | */
   public static final int COMP_METADATA_TYPE_EVENTS = 4; /* Meta data for the events interface. | */
   public static final int COMP_METADATA_TYPE_ACTUATORS = 5; /* Meta data for actuator configuration (motors, servos and vehicle geometry) and testing. | */
   public static final int COMP_METADATA_TYPE_ENUM_END = 6; /*  | */
}
            