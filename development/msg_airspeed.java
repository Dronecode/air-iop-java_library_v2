/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AIRSPEED PACKING
package com.MAVLink.development;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Airspeed information from a sensor.
 */
public class msg_airspeed extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_AIRSPEED = 295;
    public static final int MAVLINK_MSG_LENGTH = 20;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AIRSPEED;

      
    /**
     * Calibrated airspeed (CAS) if available, otherwise indicated airspeed (IAS).
     */
    public float airspeed;
      
    /**
     * Differential pressure. NaN for value unknown/not supplied.
     */
    public float press_diff;
      
    /**
     * Static pressure. NaN for value unknown/not supplied.
     */
    public float press_static;
      
    /**
     * Error/accuracy. NaN for value unknown/not supplied.
     */
    public float error;
      
    /**
     * Temperature. INT16_MAX for value unknown/not supplied.
     */
    public short temperature;
      
    /**
     * Sensor ID.
     */
    public short id;
      
    /**
     * Airspeed sensor type. NaN for value unknown/not supplied. Used to estimate accuracy (i.e. as an alternative to using the error field).
     */
    public short type;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_AIRSPEED;
        
        packet.payload.putFloat(airspeed);
        packet.payload.putFloat(press_diff);
        packet.payload.putFloat(press_static);
        packet.payload.putFloat(error);
        packet.payload.putShort(temperature);
        packet.payload.putUnsignedByte(id);
        packet.payload.putUnsignedByte(type);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a airspeed message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.airspeed = payload.getFloat();
        this.press_diff = payload.getFloat();
        this.press_static = payload.getFloat();
        this.error = payload.getFloat();
        this.temperature = payload.getShort();
        this.id = payload.getUnsignedByte();
        this.type = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_airspeed() {
        this.msgid = MAVLINK_MSG_ID_AIRSPEED;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_airspeed( float airspeed, float press_diff, float press_static, float error, short temperature, short id, short type) {
        this.msgid = MAVLINK_MSG_ID_AIRSPEED;

        this.airspeed = airspeed;
        this.press_diff = press_diff;
        this.press_static = press_static;
        this.error = error;
        this.temperature = temperature;
        this.id = id;
        this.type = type;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_airspeed( float airspeed, float press_diff, float press_static, float error, short temperature, short id, short type, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_AIRSPEED;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.airspeed = airspeed;
        this.press_diff = press_diff;
        this.press_static = press_static;
        this.error = error;
        this.temperature = temperature;
        this.id = id;
        this.type = type;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_airspeed(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_AIRSPEED;
        
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
        return "MAVLINK_MSG_ID_AIRSPEED - sysid:"+sysid+" compid:"+compid+" airspeed:"+airspeed+" press_diff:"+press_diff+" press_static:"+press_static+" error:"+error+" temperature:"+temperature+" id:"+id+" type:"+type+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_AIRSPEED";
    }
}
        