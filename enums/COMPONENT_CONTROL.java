/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * Type of controls or state changes for system components.
 */
public class COMPONENT_CONTROL {
   public static final int COMPONENT_CONTROL_START = 1; /* Start/turn-on system component. | */
   public static final int COMPONENT_CONTROL_STOP = 2; /* Stop/turn-off system component. | */
   public static final int COMPONENT_CONTROL_RESTART = 3; /* Restart/reboot system component. | */
   public static final int COMPONENT_CONTROL_RESTART_AND_KEEP_BL = 4; /* Restart/reboot system component and keep it in the bootloader until upgraded. | */
   public static final int COMPONENT_CONTROL_ENABLE = 5; /* Enable system component. Used to switch a system component from an idle state to an active state. | */
   public static final int COMPONENT_CONTROL_DISABLE = 6; /* Disable system component. Used to switch a system component from an active state to an idle state. | */
   public static final int COMPONENT_CONTROL_ENUM_END = 7; /*  | */
}
            