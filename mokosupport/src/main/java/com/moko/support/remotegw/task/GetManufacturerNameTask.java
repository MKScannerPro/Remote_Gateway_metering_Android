package com.moko.support.remotegw.task;

import com.moko.ble.lib.task.OrderTask;
import com.moko.support.remotegw.entity.OrderCHAR;

public class GetManufacturerNameTask extends OrderTask {

    public byte[] data;

    public GetManufacturerNameTask() {
        super(OrderCHAR.CHAR_MANUFACTURER_NAME, OrderTask.RESPONSE_TYPE_READ);
    }

    @Override
    public byte[] assemble() {
        return data;
    }
}
