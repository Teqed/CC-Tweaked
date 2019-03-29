/*
 * This file is part of ComputerCraft - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2019. Do not distribute without permission.
 * Send enquiries to dratcliffe@gmail.com
 */

package dan200.computercraft.shared.peripheral.modem;

/**
 * This only exists for backwards compatibility
 */
public abstract class WirelessModemPeripheral extends dan200.computercraft.shared.peripheral.modem.wireless.WirelessModemPeripheral
{
    @Deprecated
    public WirelessModemPeripheral( boolean advanced )
    {
        super( new ModemState(), advanced );
    }
}
