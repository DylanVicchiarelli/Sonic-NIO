/**
 * Copyright (C) 2021 Dylan Vicchiarelli
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.vicc.net.packet;

import java.nio.ByteBuffer;

public class Packet {

   /**
    * The numeric identifier for this packet.
    */
   private int opcode;

   /**
    * The data length of this packet.
    */
   private int length;

   /**
    * The data stored in this packet.
    */
   private ByteBuffer payload;

   public Packet(int opcode, int length, ByteBuffer payload) {
	 this.opcode = opcode;
	 this.length = length;
	 this.payload = payload;
   }

   public int getOpcode() {
	 return opcode;
   }

   public void setOpcode(int opcode) {
	 this.opcode = opcode;
   }

   public int getLength() {
	 return length;
   }

   public void setLength(int length) {
	 this.length = length;
   }

   public ByteBuffer getPayload() {
	 return payload;
   }

   public void setPayload(ByteBuffer payload) {
	 this.payload = payload;
   }
}