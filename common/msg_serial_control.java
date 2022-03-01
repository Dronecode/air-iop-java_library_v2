/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SERIAL_CONTROL PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Control a serial port. This can be used for raw access to an onboard serial peripheral such as a GPS or telemetry radio. It is designed to make it possible to update the devices firmware via MAVLink messages or change the devices settings. A message with zero bytes can be used to change just the baudrate.
 */
public class msg_serial_control extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SERIAL_CONTROL = 126;
    public static final int MAVLINK_MSG_LENGTH = 81;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SERIAL_CONTROL;

      
    /**
     * Baudrate of transfer. Zero means no change.
     */
    public long baudrate;
      
    /**
     * Timeout for reply data
     */
    public int timeout;
      
    /**
     * Serial control device type.
     */
    public short device;
      
    /**
     * Bitmap of serial control flags.
     */
    public short flags;
      
    /**
     * how many bytes in this transfer
     */
    public short count;
      
    /**
     * serial data
     */
    public short data[] = new short[70];
      
    /**
     * System ID
     */
    public short target_system;
      
    /**
     * Component ID
     */
    public short target_component;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;
        
        packet.payload.putUnsignedInt(baudrate);
        packet.payload.putUnsignedShort(timeout);
        packet.payload.putUnsignedByte(device);
        packet.payload.putUnsignedByte(flags);
        packet.payload.putUnsignedByte(count);
        
        for (int i = 0; i < data.length; i++) {
            packet.payload.putUnsignedByte(data[i]);
        }
                    
        
        if (isMavlink2) {
             packet.payload.putUnsignedByte(target_system);
             packet.payload.putUnsignedByte(target_component);
            
        }
        return packet;
    }

    /**
     * Decode a serial_control message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.baudrate = payload.getUnsignedInt();
        this.timeout = payload.getUnsignedShort();
        this.device = payload.getUnsignedByte();
        this.flags = payload.getUnsignedByte();
        this.count = payload.getUnsignedByte();
         
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
             this.target_system = payload.getUnsignedByte();
             this.target_component = payload.getUnsignedByte();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_serial_control() {
        this.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_serial_control( long baudrate, int timeout, short device, short flags, short count, short[] data, short target_system, short target_component) {
        this.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;

        this.baudrate = baudrate;
        this.timeout = timeout;
        this.device = device;
        this.flags = flags;
        this.count = count;
        this.data = data;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_serial_control( long baudrate, int timeout, short device, short flags, short count, short[] data, short target_system, short target_component, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.baudrate = baudrate;
        this.timeout = timeout;
        this.device = device;
        this.flags = flags;
        this.count = count;
        this.data = data;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_serial_control(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SERIAL_CONTROL;
        
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
        return "MAVLINK_MSG_ID_SERIAL_CONTROL - sysid:"+sysid+" compid:"+compid+" baudrate:"+baudrate+" timeout:"+timeout+" device:"+device+" flags:"+flags+" count:"+count+" data:"+data+" target_system:"+target_system+" target_component:"+target_component+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_SERIAL_CONTROL";
    }
}
        