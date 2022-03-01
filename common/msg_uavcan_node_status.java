/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE UAVCAN_NODE_STATUS PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * General status information of an UAVCAN node. Please refer to the definition of the UAVCAN message "uavcan.protocol.NodeStatus" for the background information. The UAVCAN specification is available at http://uavcan.org.
 */
public class msg_uavcan_node_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_UAVCAN_NODE_STATUS = 310;
    public static final int MAVLINK_MSG_LENGTH = 17;
    private static final long serialVersionUID = MAVLINK_MSG_ID_UAVCAN_NODE_STATUS;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    public long time_usec;
      
    /**
     * Time since the start-up of the node.
     */
    public long uptime_sec;
      
    /**
     * Vendor-specific status information.
     */
    public int vendor_specific_status_code;
      
    /**
     * Generalized node health status.
     */
    public short health;
      
    /**
     * Generalized operating mode.
     */
    public short mode;
      
    /**
     * Not used currently.
     */
    public short sub_mode;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_UAVCAN_NODE_STATUS;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putUnsignedInt(uptime_sec);
        packet.payload.putUnsignedShort(vendor_specific_status_code);
        packet.payload.putUnsignedByte(health);
        packet.payload.putUnsignedByte(mode);
        packet.payload.putUnsignedByte(sub_mode);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a uavcan_node_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.uptime_sec = payload.getUnsignedInt();
        this.vendor_specific_status_code = payload.getUnsignedShort();
        this.health = payload.getUnsignedByte();
        this.mode = payload.getUnsignedByte();
        this.sub_mode = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_uavcan_node_status() {
        this.msgid = MAVLINK_MSG_ID_UAVCAN_NODE_STATUS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_uavcan_node_status( long time_usec, long uptime_sec, int vendor_specific_status_code, short health, short mode, short sub_mode) {
        this.msgid = MAVLINK_MSG_ID_UAVCAN_NODE_STATUS;

        this.time_usec = time_usec;
        this.uptime_sec = uptime_sec;
        this.vendor_specific_status_code = vendor_specific_status_code;
        this.health = health;
        this.mode = mode;
        this.sub_mode = sub_mode;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_uavcan_node_status( long time_usec, long uptime_sec, int vendor_specific_status_code, short health, short mode, short sub_mode, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_UAVCAN_NODE_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.uptime_sec = uptime_sec;
        this.vendor_specific_status_code = vendor_specific_status_code;
        this.health = health;
        this.mode = mode;
        this.sub_mode = sub_mode;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_uavcan_node_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_UAVCAN_NODE_STATUS;
        
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
        return "MAVLINK_MSG_ID_UAVCAN_NODE_STATUS - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" uptime_sec:"+uptime_sec+" vendor_specific_status_code:"+vendor_specific_status_code+" health:"+health+" mode:"+mode+" sub_mode:"+sub_mode+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_UAVCAN_NODE_STATUS";
    }
}
        