/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GIMBAL_DEVICE_ATTITUDE_STATUS PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Message reporting the status of a gimbal device.
	  This message should be broadcast by a gimbal device component at a low regular rate (e.g. 5 Hz).
	  For the angles encoded in the quaternion and the angular velocities holds:
	  If the flag GIMBAL_DEVICE_FLAGS_YAW_IN_VEHICLE_FRAME is set, then they are relative to the vehicle heading (vehicle frame).
	  If the flag GIMBAL_DEVICE_FLAGS_YAW_IN_EARTH_FRAME is set, then they are relative to absolute North (earth frame).
	  If neither of these flags are set, then (for backwards compatibility) it holds:
	  If the flag GIMBAL_DEVICE_FLAGS_YAW_LOCK is set, then they are relative to absolute North (earth frame),
	  else they are relative to the vehicle heading (vehicle frame).
	  Other conditions of the flags are not allowed.
	  The quaternion and angular velocities in the other frame can be calculated from delta_yaw and delta_yaw_velocity as
	  q_earth = q_delta_yaw * q_vehicle and w_earth = w_delta_yaw_velocity + w_vehicle (if not NaN).
	  If neither the GIMBAL_DEVICE_FLAGS_YAW_IN_VEHICLE_FRAME nor the GIMBAL_DEVICE_FLAGS_YAW_IN_EARTH_FRAME flag is set,
	  then (for backwards compatibility) the data in the delta_yaw and delta_yaw_velocity fields are to be ignored.
	  New implementations should always set either GIMBAL_DEVICE_FLAGS_YAW_IN_VEHICLE_FRAME or GIMBAL_DEVICE_FLAGS_YAW_IN_EARTH_FRAME,
	  and always should set delta_yaw and delta_yaw_velocity either to the proper value or NaN.
 */
public class msg_gimbal_device_attitude_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS = 285;
    public static final int MAVLINK_MSG_LENGTH = 49;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;

    
    /**
     * Timestamp (time since system boot).
     */
    @Description("Timestamp (time since system boot).")
    @Units("ms")
    public long time_boot_ms;
    
    /**
     * Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation). The frame is described in the message description.
     */
    @Description("Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation). The frame is described in the message description.")
    @Units("")
    public float q[] = new float[4];
    
    /**
     * X component of angular velocity (positive: rolling to the right). The frame is described in the message description. NaN if unknown.
     */
    @Description("X component of angular velocity (positive: rolling to the right). The frame is described in the message description. NaN if unknown.")
    @Units("rad/s")
    public float angular_velocity_x;
    
    /**
     * Y component of angular velocity (positive: pitching up). The frame is described in the message description. NaN if unknown.
     */
    @Description("Y component of angular velocity (positive: pitching up). The frame is described in the message description. NaN if unknown.")
    @Units("rad/s")
    public float angular_velocity_y;
    
    /**
     * Z component of angular velocity (positive: yawing to the right). The frame is described in the message description. NaN if unknown.
     */
    @Description("Z component of angular velocity (positive: yawing to the right). The frame is described in the message description. NaN if unknown.")
    @Units("rad/s")
    public float angular_velocity_z;
    
    /**
     * Failure flags (0 for no failure)
     */
    @Description("Failure flags (0 for no failure)")
    @Units("")
    public long failure_flags;
    
    /**
     * Current gimbal flags set.
     */
    @Description("Current gimbal flags set.")
    @Units("")
    public int flags;
    
    /**
     * System ID
     */
    @Description("System ID")
    @Units("")
    public short target_system;
    
    /**
     * Component ID
     */
    @Description("Component ID")
    @Units("")
    public short target_component;
    
    /**
     * Yaw angle relating the quaternions in earth and body frames (see message description). NaN if unknown.
     */
    @Description("Yaw angle relating the quaternions in earth and body frames (see message description). NaN if unknown.")
    @Units("rad")
    public float delta_yaw;
    
    /**
     * Yaw angular velocity relating the angular velocities in earth and body frames (see message description). NaN if unknown.
     */
    @Description("Yaw angular velocity relating the angular velocities in earth and body frames (see message description). NaN if unknown.")
    @Units("rad/s")
    public float delta_yaw_velocity;
    
    /**
     * This field is to be used if the gimbal manager and the gimbal device are the same component and hence have the same component ID. This field is then set a number between 1-6. If the component ID is separate, this field is not required and must be set to 0.
     */
    @Description("This field is to be used if the gimbal manager and the gimbal device are the same component and hence have the same component ID. This field is then set a number between 1-6. If the component ID is separate, this field is not required and must be set to 0.")
    @Units("")
    public short gimbal_device_id;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;

        packet.payload.putUnsignedInt(time_boot_ms);
        
        for (int i = 0; i < q.length; i++) {
            packet.payload.putFloat(q[i]);
        }
                    
        packet.payload.putFloat(angular_velocity_x);
        packet.payload.putFloat(angular_velocity_y);
        packet.payload.putFloat(angular_velocity_z);
        packet.payload.putUnsignedInt(failure_flags);
        packet.payload.putUnsignedShort(flags);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (isMavlink2) {
             packet.payload.putFloat(delta_yaw);
             packet.payload.putFloat(delta_yaw_velocity);
             packet.payload.putUnsignedByte(gimbal_device_id);
            
        }
        return packet;
    }

    /**
     * Decode a gimbal_device_attitude_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();
        
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
        this.angular_velocity_x = payload.getFloat();
        this.angular_velocity_y = payload.getFloat();
        this.angular_velocity_z = payload.getFloat();
        this.failure_flags = payload.getUnsignedInt();
        this.flags = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.delta_yaw = payload.getFloat();
             this.delta_yaw_velocity = payload.getFloat();
             this.gimbal_device_id = payload.getUnsignedByte();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gimbal_device_attitude_status() {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gimbal_device_attitude_status( long time_boot_ms, float[] q, float angular_velocity_x, float angular_velocity_y, float angular_velocity_z, long failure_flags, int flags, short target_system, short target_component, float delta_yaw, float delta_yaw_velocity, short gimbal_device_id) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;

        this.time_boot_ms = time_boot_ms;
        this.q = q;
        this.angular_velocity_x = angular_velocity_x;
        this.angular_velocity_y = angular_velocity_y;
        this.angular_velocity_z = angular_velocity_z;
        this.failure_flags = failure_flags;
        this.flags = flags;
        this.target_system = target_system;
        this.target_component = target_component;
        this.delta_yaw = delta_yaw;
        this.delta_yaw_velocity = delta_yaw_velocity;
        this.gimbal_device_id = gimbal_device_id;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gimbal_device_attitude_status( long time_boot_ms, float[] q, float angular_velocity_x, float angular_velocity_y, float angular_velocity_z, long failure_flags, int flags, short target_system, short target_component, float delta_yaw, float delta_yaw_velocity, short gimbal_device_id, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.q = q;
        this.angular_velocity_x = angular_velocity_x;
        this.angular_velocity_y = angular_velocity_y;
        this.angular_velocity_z = angular_velocity_z;
        this.failure_flags = failure_flags;
        this.flags = flags;
        this.target_system = target_system;
        this.target_component = target_component;
        this.delta_yaw = delta_yaw;
        this.delta_yaw_velocity = delta_yaw_velocity;
        this.gimbal_device_id = gimbal_device_id;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gimbal_device_attitude_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                            
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" q:"+q+" angular_velocity_x:"+angular_velocity_x+" angular_velocity_y:"+angular_velocity_y+" angular_velocity_z:"+angular_velocity_z+" failure_flags:"+failure_flags+" flags:"+flags+" target_system:"+target_system+" target_component:"+target_component+" delta_yaw:"+delta_yaw+" delta_yaw_velocity:"+delta_yaw_velocity+" gimbal_device_id:"+gimbal_device_id+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS";
    }
}
        