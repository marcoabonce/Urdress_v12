package com.example.xdd.urdress_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/*
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;*/
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.net.Proxy;


public class MainActivity extends AppCompatActivity {

    private TextView crearCuenta;
    private static final String NAMESPACE = "http://drees.siidmex.com.mx/wsAppDress.asmx/";
    private static final String MAIN_REQUEST_URL = "http://drees.siidmex.com.mx/wsAppDress.asmx";
    private static final String SOAP_ACTION = "http://drees.siidmex.com.mx/wsAppDress.asmx/loguin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        crearCuenta = (TextView) findViewById(R.id.txtcuentaURD);
        crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(crearCuenta.getContext(), Registro_1.class);
                startActivity(intent);
            }
        });
/*
        String methodname = "logui";
        SoapObject request = new SoapObject(NAMESPACE, methodname);
        request.addProperty("contrasenia", "20barney");
        request.addProperty("dato", "marcoabonce@hotmail.com");
        request.addProperty("esFacebook", "false");
        request.addProperty("idTipoDispositivo", "0");
        request.addProperty("idTipoLoguin", "0");
        request.addProperty("idTipoUsuario", "0");
        request.addProperty("tokenDispositivo", "");

        SoapSerializationEnvelope envelope = getSoapSerializationEnvelope(request) ;



        HttpTransportSE ht = getHttpTransportSE();
        String data =null;
        try {
            ht.call(SOAP_ACTION, envelope);
            SoapPrimitive resultsString = (SoapPrimitive)envelope.getResponse();
            data = resultsString.toString();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

        Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG).show();

        */
        /*AltaUsuario alta = retrofit.create(AltaUsuario.class);
        Call<Resp> usuarioCall = alta.getUsu(1,"maeeaahh@gmail.com", "marhjaaakhcgaaa",
                "xd","xd","xd","xd", "cf",
                "5543", "garda", "12", "1", 1, 11320,
                1, 275, 15, 1, "xd");*/

        // String Mensaje;

        /*
        Loguin loguin = retrofit.create(Loguin.class);
        Call<Task> usuarioCall = loguin.getIni("20barney", "marcoabonce@hotmail.com", "false",
                "0", "0","0","");
        usuarioCall.enqueue(new Callback<Task>() {
            @Override
            public void onResponse(Call<Task> call, Response<Task> response) {
                Task resp=response.body();
                Toast.makeText(getApplicationContext(),"xD: "+resp, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Task> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Nel", Toast.LENGTH_LONG).show();
                Log.e("mal",t.getMessage());
            }
        });
    }
        */
    }

/*
    private final SoapSerializationEnvelope getSoapSerializationEnvelope(SoapObject request) {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = true;
        envelope.implicitTypes = true;
        envelope.setAddAdornments(false);
        envelope.setOutputSoapObject(request);

        return envelope;
    }

    private final HttpTransportSE getHttpTransportSE() {
        HttpTransportSE ht = new HttpTransportSE(Proxy.NO_PROXY,MAIN_REQUEST_URL,60000);
        ht.debug = true;
        ht.setXmlVersionTag("<!--?xml version=\"1.0\" encoding= \"UTF-8\" ?-->");
        return ht;
    }
*/

}

/*


keytool -exportcert -alias androiddebugkey -keystore "C:\Users\Dell\.android\debug.keystore" | "C:\Users\Dell\Downloads\openssl-0.9.8k_X64\bin\openssl" sha1 -binary | "C:\Users\Dell\Downloads\openssl-0.9.8k_X64\bin\openssl" base64


 */