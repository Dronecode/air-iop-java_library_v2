/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GIMBAL_MANAGER_SET_ATTITUDE PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * High level message to control a gimbal's attitude. This message is to be sent to the gimbal manager (e.g. from a ground station). Angles and rates can be set to NaN according to use case.
 */
public class msg_gimbal_manager_set_attitude extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GIMBAL_MANAGER_SET_ATTITUDE = 282;
    public static final int MAVLINK_MSG_LENGTH = 35;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GIMBAL_MANAGER_SET_ATTITUDE;

    
    /**
     * High level gimbal manager flags to use.
     */
    @Description("High level gimbal manager flags to use.")
    @Units("")
    public long flags;
    
    /**
     * Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation, the frame is depends on whether the flag GIMBAL_MANAGER_FLAGS_YAW_LOCK is set)
     */
    @Description("Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation, the frame is depends on whether the flag GIMBAL_MANAGER_FLAGS_YAW_LOCK is set)")
    @Units("")
    public float q[] = new float[4];
    
    /**
     * X component of angular velocity, positive is rolling to the right, NaN to be ignored.
     */
    @Description("X component of angular velocity, positive is rolling to the right, NaN to be ignored.")
    @Units("rad/s")
    public float angular_velocity_x;
    
    /**
     * Y component of angular velocity, positive is pitching up, NaN to be ignored.
     */
    @Description("Y component of angular velocity, positive is pitching up, NaN to be ignored.")
    @Units("rad/s")
    public float angular_velocity_y;
    
    /**
     * Z component of angular velocity, positive is yawing to the right, NaN to be ignored.
     */
    @Description("Z component of angular velocity, positive is yawing to the right, NaN to be ignored.")
    @Units("rad/s")
    public float angular_velocity_z;
    
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
     * Component ID of gimbal device to address (or 1-6 for non-MAVLink gimbal), 0 for all gimbal device components. Send command multiple times for more than one gimbal (but not all gimbals).
     */
    @Description("Component ID of gimbal device to address (or 1-6 for non-MAVLink gimbal), 0 for all gimbal device components. Send command multiple times for more than one gimbal (but not all gimbals).")
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
        packet.msgid = MAVLINK_MSG_ID_GIMBAL_MANAGER_SET_ATTITUDE;

        packet.payload.putUnsignedInt(flags);
        
        for (int i = 0; i < q.length; i++) {
            packet.payload.putFloat(q[i]);
        }
                    
        packet.payload.putFloat(angular_velocity_x);
        packet.payload.putFloat(angular_velocity_y);
        packet.payload.putFloat(angular_velocity_z);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(gimbal_device_id);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gimbal_manager_set_attitude message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.flags = payload.getUnsignedInt();
        
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
        this.angular_velocity_x = payload.getFloat();
        this.angular_velocity_y = payload.getFloat();
        this.angular_velocity_z = payload.getFloat();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.gimbal_device_id = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gimbal_manager_set_attitude() {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_MANAGER_SET_ATTITUDE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gimbal_manager_set_attitude( long flags, float[] q, float angular_velocity_x, float angular_velocity_y, float angular_velocity_z, short target_system, short target_component, short gimbal_device_id) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_MANAGER_SET_ATTITUDE;

        this.flags = flags;
        this.q = q;
        this.angular_velocity_x = angular_velocity_x;
        this.angular_velocity_y = angular_velocity_y;
        this.angular_velocity_z = angular_velocity_z;
        this.target_system = target_system;
        this.target_component = target_component;
        this.gimbal_device_id = gimbal_device_id;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gimbal_manager_set_attitude( long flags, float[] q, float angular_velocity_x, float angular_velocity_y, float angular_velocity_z, short target_system, short target_component, short gimbal_device_id, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_MANAGER_SET_ATTITUDE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.flags = flags;
        this.q = q;
        this.angular_velocity_x = angular_velocity_x;
        this.angular_velocity_y = angular_velocity_y;
        this.angular_velocity_z = angular_velocity_z;
        this.target_system = target_system;
        this.target_component = target_component;
        this.gimbal_device_id = gimbal_device_id;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gimbal_manager_set_attitude(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_MANAGER_SET_ATTITUDE;

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
        return "MAVLINK_MSG_ID_GIMBAL_MANAGER_SET_ATTITUDE - sysid:"+sysid+" compid:"+compid+" flags:"+flags+" q:"+q+" angular_velocity_x:"+angular_velocity_x+" angular_velocity_y:"+angular_velocity_y+" angular_velocity_z:"+angular_velocity_z+" target_system:"+target_system+" target_component:"+target_component+" gimbal_device_id:"+gimbal_device_id+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GIMBAL_MANAGER_SET_ATTITUDE";
    }
}
        