/* Mx1ProgrammerManager.java */
package jmri.jmrix.zimo;

import jmri.AddressedProgrammer;
import jmri.Programmer;
import jmri.managers.DefaultProgrammerManager;

/**
 * Extend DefaultProgrammerManager to provide ops mode programmers for MRC
 * systems
 *
 * @see jmri.ProgrammerManager
 * @author	Bob Jacobsen Copyright (C) 2002
 * @author	Ken Cameron Copyright (C) 2014
 * @author Kevin Dickerson Copyright (C) 2014
 * 
 */
public class Mx1ProgrammerManager extends DefaultProgrammerManager {

    Mx1TrafficController tc;

    public Mx1ProgrammerManager(Programmer serviceModeProgrammer, Mx1SystemConnectionMemo memo) {
        super(serviceModeProgrammer, memo);
        this.tc = memo.getMx1TrafficController();
    }

    /**
     * Works with command station to provide Ops Mode, so say it works
     *
     * @return true
     */
    @Override
    public boolean isAddressedModePossible() {
        return false;
    }

    @Override
    public boolean isGlobalProgrammerAvailable() {
        return true;
    }

    @Override
    public AddressedProgrammer getAddressedProgrammer(boolean pLongAddress, int pAddress) {
        //return new MrcOpsModeProgrammer(tc, pAddress, pLongAddress);
        return null;
    }

    @Override
    public AddressedProgrammer reserveAddressedProgrammer(boolean pLongAddress, int pAddress) {
        return null;
    }
}



