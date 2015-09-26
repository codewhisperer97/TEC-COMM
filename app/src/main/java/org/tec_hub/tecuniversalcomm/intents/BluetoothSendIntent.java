package org.tec_hub.tecuniversalcomm.intents;

import android.content.Context;
import android.content.Intent;

import com.google.common.base.Preconditions;

import org.tec_hub.tecuniversalcomm.data.connection.BluetoothConnection;
import org.tec_hub.tecuniversalcomm.data.connection.ConnectionService;

/**
 * Created by Nick Mosher on 4/29/15.
 * Is a pre-built intent that targets the ConnectionService that will
 * transfer String data to be sent over the given BluetoothConnection.
 */
public class BluetoothSendIntent extends Intent implements TECIntent {

    public BluetoothSendIntent(Context context, BluetoothConnection connection, String data) {
        super(context, ConnectionService.class);
        Preconditions.checkNotNull(connection);
        Preconditions.checkNotNull(data);

        setAction(ACTION_BLUETOOTH_SEND_DATA);
        putExtra(CONNECTION_TYPE, CONNECTION_TYPE_BLUETOOTH);
        putExtra(BLUETOOTH_CONNECTION_DATA, connection);
        putExtra(BLUETOOTH_TO_SEND_DATA, data);
    }
}
