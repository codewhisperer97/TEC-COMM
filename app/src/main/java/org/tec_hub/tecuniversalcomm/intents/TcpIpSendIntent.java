package org.tec_hub.tecuniversalcomm.intents;

import android.content.Context;
import android.content.Intent;

import com.google.common.base.Preconditions;

import org.tec_hub.tecuniversalcomm.data.connection.ConnectionService;
import org.tec_hub.tecuniversalcomm.data.connection.TcpIpConnection;

/**
 * Created by Nick Mosher on 9/15/15.
 */
public class TcpIpSendIntent extends Intent implements TECIntent {

    public TcpIpSendIntent(Context context, TcpIpConnection connection, String data) {
        super(context, ConnectionService.class);
        Preconditions.checkNotNull(connection);

        setAction(ACTION_TCPIP_SEND_DATA);
        putExtra(CONNECTION_TYPE, CONNECTION_TYPE_TCPIP);
        putExtra(TCPIP_CONNECTION_DATA, connection);
        putExtra(TCPIP_TO_SEND_DATA, data);
    }
}
