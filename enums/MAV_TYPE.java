/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * MAVLINK component type reported in HEARTBEAT message. Flight controllers must report the type of the vehicle on which they are mounted (e.g. MAV_TYPE_OCTOROTOR). All other components must report a value appropriate for their type (e.g. a camera must use MAV_TYPE_CAMERA).
 */
public class MAV_TYPE {
   public static final int MAV_TYPE_GENERIC = 0; /* Generic micro air vehicle | */
   public static final int MAV_TYPE_FIXED_WING = 1; /* Fixed wing aircraft. | */
   public static final int MAV_TYPE_QUADROTOR = 2; /* Quadrotor | */
   public static final int MAV_TYPE_COAXIAL = 3; /* Coaxial helicopter | */
   public static final int MAV_TYPE_HELICOPTER = 4; /* Normal helicopter with tail rotor. | */
   public static final int MAV_TYPE_ANTENNA_TRACKER = 5; /* Ground installation | */
   public static final int MAV_TYPE_GCS = 6; /* Operator control unit / ground control station | */
   public static final int MAV_TYPE_AIRSHIP = 7; /* Airship, controlled | */
   public static final int MAV_TYPE_FREE_BALLOON = 8; /* Free balloon, uncontrolled | */
   public static final int MAV_TYPE_ROCKET = 9; /* Rocket | */
   public static final int MAV_TYPE_GROUND_ROVER = 10; /* Ground rover | */
   public static final int MAV_TYPE_SURFACE_BOAT = 11; /* Surface vessel, boat, ship | */
   public static final int MAV_TYPE_SUBMARINE = 12; /* Submarine | */
   public static final int MAV_TYPE_HEXAROTOR = 13; /* Hexarotor | */
   public static final int MAV_TYPE_OCTOROTOR = 14; /* Octorotor | */
   public static final int MAV_TYPE_TRICOPTER = 15; /* Tricopter | */
   public static final int MAV_TYPE_FLAPPING_WING = 16; /* Flapping wing | */
   public static final int MAV_TYPE_KITE = 17; /* Kite | */
   public static final int MAV_TYPE_ONBOARD_CONTROLLER = 18; /* Onboard companion controller | */
   public static final int MAV_TYPE_VTOL_TAILSITTER_DUOROTOR = 19; /* Two-rotor Tailsitter VTOL that additionally uses control surfaces in vertical operation. Note, value previously named MAV_TYPE_VTOL_DUOROTOR. | */
   public static final int MAV_TYPE_VTOL_TAILSITTER_QUADROTOR = 20; /* Quad-rotor Tailsitter VTOL using a V-shaped quad config in vertical operation. Note: value previously named MAV_TYPE_VTOL_QUADROTOR. | */
   public static final int MAV_TYPE_VTOL_TILTROTOR = 21; /* Tiltrotor VTOL. Fuselage and wings stay (nominally) horizontal in all flight phases. It able to tilt (some) rotors to provide thrust in cruise flight. | */
   public static final int MAV_TYPE_VTOL_FIXEDROTOR = 22; /* VTOL with separate fixed rotors for hover and cruise flight. Fuselage and wings stay (nominally) horizontal in all flight phases. | */
   public static final int MAV_TYPE_VTOL_TAILSITTER = 23; /* Tailsitter VTOL. Fuselage and wings orientation changes depending on flight phase: vertical for hover, horizontal for cruise. Use more specific VTOL MAV_TYPE_VTOL_DUOROTOR or MAV_TYPE_VTOL_QUADROTOR if appropriate. | */
   public static final int MAV_TYPE_VTOL_TILTWING = 24; /* Tiltwing VTOL. Fuselage stays horizontal in all flight phases. The whole wing, along with any attached engine, can tilt between vertical and horizontal mode. | */
   public static final int MAV_TYPE_VTOL_RESERVED5 = 25; /* VTOL reserved 5 | */
   public static final int MAV_TYPE_GIMBAL = 26; /* Gimbal | */
   public static final int MAV_TYPE_ADSB = 27; /* ADSB system | */
   public static final int MAV_TYPE_PARAFOIL = 28; /* Steerable, nonrigid airfoil | */
   public static final int MAV_TYPE_DODECAROTOR = 29; /* Dodecarotor | */
   public static final int MAV_TYPE_CAMERA = 30; /* Camera | */
   public static final int MAV_TYPE_CHARGING_STATION = 31; /* Charging station | */
   public static final int MAV_TYPE_FLARM = 32; /* FLARM collision avoidance system | */
   public static final int MAV_TYPE_SERVO = 33; /* Servo | */
   public static final int MAV_TYPE_ODID = 34; /* Open Drone ID. See https://mavlink.io/en/services/opendroneid.html. | */
   public static final int MAV_TYPE_DECAROTOR = 35; /* Decarotor | */
   public static final int MAV_TYPE_BATTERY = 36; /* Battery | */
   public static final int MAV_TYPE_PARACHUTE = 37; /* Parachute | */
   public static final int MAV_TYPE_LOG = 38; /* Log | */
   public static final int MAV_TYPE_OSD = 39; /* OSD | */
   public static final int MAV_TYPE_IMU = 40; /* IMU | */
   public static final int MAV_TYPE_GPS = 41; /* GPS | */
   public static final int MAV_TYPE_WINCH = 42; /* Winch | */
   public static final int MAV_TYPE_ENUM_END = 43; /*  | */
}
            