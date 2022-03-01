/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE WIFI_CONFIG_AP PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Configure WiFi AP SSID, password, and mode. This message is re-emitted as an acknowledgement by the AP. The message may also be explicitly requested using MAV_CMD_REQUEST_MESSAGE
 */
public class msg_wifi_config_ap extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_WIFI_CONFIG_AP = 299;
    public static final int MAVLINK_MSG_LENGTH = 98;
    private static final long serialVersionUID = MAVLINK_MSG_ID_WIFI_CONFIG_AP;

      
    /**
     * Name of Wi-Fi network (SSID). Blank to leave it unchanged when setting. Current SSID when sent back as a response.
     */
    public byte ssid[] = new byte[32];
      
    /**
     * Password. Blank for an open AP. MD5 hash when message is sent back as a response.
     */
    public byte password[] = new byte[64];
      
    /**
     * WiFi Mode.
     */
    public byte mode;
      
    /**
     * Message acceptance response (sent back to GS).
     */
    public byte response;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;
        
        
        for (int i = 0; i < ssid.length; i++) {
            packet.payload.putByte(ssid[i]);
        }
                    
        
        for (int i = 0; i < password.length; i++) {
            packet.payload.putByte(password[i]);
        }
                    
        
        if (isMavlink2) {
             packet.payload.putByte(mode);
             packet.payload.putByte(response);
            
        }
        return packet;
    }

    /**
     * Decode a wifi_config_ap message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
         
        for (int i = 0; i < this.ssid.length; i++) {
            this.ssid[i] = payload.getByte();
        }
                
         
        for (int i = 0; i < this.password.length; i++) {
            this.password[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
             this.mode = payload.getByte();
             this.response = payload.getByte();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_wifi_config_ap() {
        this.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_wifi_config_ap( byte[] ssid, byte[] password, byte mode, byte response) {
        this.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;

        this.ssid = ssid;
        this.password = password;
        this.mode = mode;
        this.response = response;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_wifi_config_ap( byte[] ssid, byte[] password, byte mode, byte response, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.ssid = ssid;
        this.password = password;
        this.mode = mode;
        this.response = response;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_wifi_config_ap(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_WIFI_CONFIG_AP;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

     
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setSsid(String str) {
        int len = Math.min(str.length(), 32);
        for (int i=0; i<len; i++) {
            ssid[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<32; i++) {            // padding for the rest of the buffer
            ssid[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getSsid() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 32; i++) {
            if (ssid[i] != 0)
                buf.append((char) ssid[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setPassword(String str) {
        int len = Math.min(str.length(), 64);
        for (int i=0; i<len; i++) {
            password[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<64; i++) {            // padding for the rest of the buffer
            password[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getPassword() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 64; i++) {
            if (password[i] != 0)
                buf.append((char) password[i]);
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
        return "MAVLINK_MSG_ID_WIFI_CONFIG_AP - sysid:"+sysid+" compid:"+compid+" ssid:"+ssid+" password:"+password+" mode:"+mode+" response:"+response+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_WIFI_CONFIG_AP";
    }
}
        