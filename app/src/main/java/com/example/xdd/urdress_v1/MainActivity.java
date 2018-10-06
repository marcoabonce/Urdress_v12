package com.example.xdd.urdress_v1;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class MainActivity extends AppCompatActivity {

    private TextView crearCuenta;


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

        SegundoPlano tarea = new SegundoPlano();
        tarea.execute();


    }
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
    }*/


    private class SegundoPlano extends AsyncTask<Void,Void,Void> {

        @Override
        protected void onPreExecute() {
        }

        @Override
        protected void onPostExecute(Void aVoid) {
        }

        @Override
        protected Void doInBackground(Void... voids) {
            loguinUsuario();
            return null;
        }
    }

    private void loguinUsuario (){
         String METHODNAME="loguin";
         String NAMESPACE = "http://drees.siidmex.com.mx/";
         String MAIN_REQUEST_URL = "http://drees.siidmex.com.mx/wsAppDress.asmx";
         String SOAP_ACTION = "http://tempuri.org/loguin";
         SoapPrimitive resultsString=null;

        try{
            SoapObject request = new SoapObject(NAMESPACE, METHODNAME);
            request.addProperty("contrasenia", "20barney");
            request.addProperty("dato", "marcoabonce@hotmail.com");
            request.addProperty("esFacebook", "false");
            request.addProperty("idTipoDispositivo", "0");
            request.addProperty("idTipoLoguin", "0");
            request.addProperty("idTipoUsuario", "0");
            request.addProperty("tokenDispositivo", "xdd");

            SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            soapEnvelope.dotNet = true;
            soapEnvelope.implicitTypes = true;
            soapEnvelope.setAddAdornments(false);
            soapEnvelope.setOutputSoapObject(request);

            HttpTransportSE transport = new HttpTransportSE(MAIN_REQUEST_URL);
            transport.call(SOAP_ACTION,soapEnvelope);
            resultsString=(SoapPrimitive) soapEnvelope.getResponse();

            Toast.makeText(this,"SUPER CHIDO :V "+resultsString.toString(), Toast.LENGTH_LONG).show();
        }catch(Exception e){
            Log.e("Error ","Problema"+e.getMessage());
        }
    }

    private final SoapSerializationEnvelope getSoapSerializationEnvelope(SoapObject request) {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = true;
        envelope.implicitTypes = true;
        envelope.setAddAdornments(false);
        envelope.setOutputSoapObject(request);

        return envelope;
    }

    /*
    private final HttpTransportSE getHttpTransportSE() {
        HttpTransportSE ht = new HttpTransportSE(Proxy.NO_PROXY,MAIN_REQUEST_URL,60000);
        ht.debug = true;
        ht.setXmlVersionTag("<!--?xml version=\"1.0\" encoding= \"UTF-8\" ?-->");
        return ht;
    }*/



}



//keytool -exportcert -alias androiddebugkey -keystore "C:\Users\Dell\.android\debug.keystore" | "C:\Users\Dell\Downloads\openssl-0.9.8k_X64\bin\openssl" sha1 -binary | "C:\Users\Dell\Downloads\openssl-0.9.8k_X64\bin\openssl" base64
