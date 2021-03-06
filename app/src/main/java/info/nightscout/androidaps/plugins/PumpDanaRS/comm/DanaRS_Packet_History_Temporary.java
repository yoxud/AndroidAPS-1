package info.nightscout.androidaps.plugins.PumpDanaRS.comm;

import java.util.Date;

import com.cozmo.danar.util.BleCommandUtil;

public class DanaRS_Packet_History_Temporary extends DanaRS_Packet_History_ {

    public DanaRS_Packet_History_Temporary() {
        super();
        opCode = BleCommandUtil.DANAR_PACKET__OPCODE_REVIEW__TEMPORARY;
    }

    public DanaRS_Packet_History_Temporary(Date from) {
        super(from);
        opCode = BleCommandUtil.DANAR_PACKET__OPCODE_REVIEW__TEMPORARY;
    }

    @Override
    public String getFriendlyName() {
        return "REVIEW__TEMPORARY";
    }
}
