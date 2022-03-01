/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CELLULAR_CONFIG PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Configure cellular modems.
        This message is re-emitted as an acknowledgement by the modem.
        The message may also be explicitly requested using MAV_CMD_REQUEST_MESSAGE.
 */
public class msg_cellular_config extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_CELLULAR_CONFIG = 336;
    public static final int MAVLINK_MSG_LENGTH = 84;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CELLULAR_CONFIG;

      
    /**
     * Enable/disable LTE. 0: setting unchanged, 1: disabled, 2: enabled. Current setting when sent back as a response.
     */
    public short enable_lte;
      
    /**
     * Enable/disable PIN on the SIM card. 0: setting unchanged, 1: disabled, 2: enabled. Current setting when sent back as a response.
     */
    public short enable_pin;
      
    /**
     * PIN sent to the SIM card. Blank when PIN is disabled. Empty when message is sent back as a response.
     */
    public byte pin[] = new byte[16];
      
    /**
     * New PIN when changing the PIN. Blank to leave it unchanged. Empty when message is sent back as a response.
     */
    public byte new_pin[] = new byte[16];
      
    /**
     * Name of the cellular APN. Blank to leave it unchanged. Current APN when sent back as a response.
     */
    public byte apn[] = new byte[32];
      
    /**
     * Required PUK code in case the user failed to authenticate 3 times with the PIN. Empty when message is sent back as a response.
     */
    public byte puk[] = new byte[16];
      
    /**
     * Enable/disable roaming. 0: setting unchanged, 1: disabled, 2: enabled. Current setting when sent back as a response.
     */
    public short roaming;
      
    /**
     * Message acceptance response (sent back to GS).
     */
    public short response;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_CELLULAR_CONFIG;
        
        packet.payload.putUnsignedByte(enable_lte);
        packet.payload.putUnsignedByte(enable_pin);
        
        for (int i = 0; i < pin.length; i++) {
            packet.payload.putByte(pin[i]);
        }
                    
        
        for (int i = 0; i < new_pin.length; i++) {
            packet.payload.putByte(new_pin[i]);
        }
                    
        
        for (int i = 0; i < apn.length; i++) {
            packet.payload.putByte(apn[i]);
        }
                    
        
        for (int i = 0; i < puk.length; i++) {
            packet.payload.putByte(puk[i]);
        }
                    
        packet.payload.putUnsignedByte(roaming);
        packet.payload.putUnsignedByte(response);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a cellular_config message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.enable_lte = payload.getUnsignedByte();
        this.enable_pin = payload.getUnsignedByte();
         
        for (int i = 0; i < this.pin.length; i++) {
            this.pin[i] = payload.getByte();
        }
                
         
        for (int i = 0; i < this.new_pin.length; i++) {
            this.new_pin[i] = payload.getByte();
        }
                
         
        for (int i = 0; i < this.apn.length; i++) {
            this.apn[i] = payload.getByte();
        }
                
         
        for (int i = 0; i < this.puk.length; i++) {
            this.puk[i] = payload.getByte();
        }
                
        this.roaming = payload.getUnsignedByte();
        this.response = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_cellular_config() {
        this.msgid = MAVLINK_MSG_ID_CELLULAR_CONFIG;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_cellular_config( short enable_lte, short enable_pin, byte[] pin, byte[] new_pin, byte[] apn, byte[] puk, short roaming, short response) {
        this.msgid = MAVLINK_MSG_ID_CELLULAR_CONFIG;

        this.enable_lte = enable_lte;
        this.enable_pin = enable_pin;
        this.pin = pin;
        this.new_pin = new_pin;
        this.apn = apn;
        this.puk = puk;
        this.roaming = roaming;
        this.response = response;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_cellular_config( short enable_lte, short enable_pin, byte[] pin, byte[] new_pin, byte[] apn, byte[] puk, short roaming, short response, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_CELLULAR_CONFIG;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.enable_lte = enable_lte;
        this.enable_pin = enable_pin;
        this.pin = pin;
        this.new_pin = new_pin;
        this.apn = apn;
        this.puk = puk;
        this.roaming = roaming;
        this.response = response;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_cellular_config(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_CELLULAR_CONFIG;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

         
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setPin(String str) {
        int len = Math.min(str.length(), 16);
        for (int i=0; i<len; i++) {
            pin[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<16; i++) {            // padding for the rest of the buffer
            pin[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getPin() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            if (pin[i] != 0)
                buf.append((char) pin[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setNew_Pin(String str) {
        int len = Math.min(str.length(), 16);
        for (int i=0; i<len; i++) {
            new_pin[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<16; i++) {            // padding for the rest of the buffer
            new_pin[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getNew_Pin() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            if (new_pin[i] != 0)
                buf.append((char) new_pin[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setApn(String str) {
        int len = Math.min(str.length(), 32);
        for (int i=0; i<len; i++) {
            apn[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<32; i++) {            // padding for the rest of the buffer
            apn[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getApn() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 32; i++) {
            if (apn[i] != 0)
                buf.append((char) apn[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setPuk(String str) {
        int len = Math.min(str.length(), 16);
        for (int i=0; i<len; i++) {
            puk[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<16; i++) {            // padding for the rest of the buffer
            puk[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getPuk() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            if (puk[i] != 0)
                buf.append((char) puk[i]);
            else
                break;
        }
        return buf.toString();

    }
                             
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_CELLULAR_CONFIG - sysid:"+sysid+" compid:"+compid+" enable_lte:"+enable_lte+" enable_pin:"+enable_pin+" pin:"+pin+" new_pin:"+new_pin+" apn:"+apn+" puk:"+puk+" roaming:"+roaming+" response:"+response+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_CELLULAR_CONFIG";
    }
}
        