package com.example.android.ihcen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.os.AsyncTask;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;







public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /********************************/
         /*    Define all the buttons    */
        /********************************/


        Switch led2 = (Switch) findViewById(R.id.Led2);

        Switch led4 = (Switch) findViewById(R.id.Led4);

        Switch led5 = (Switch) findViewById(R.id.Led5);

        Switch led6 = (Switch) findViewById(R.id.Led6);

        Switch led7 = (Switch) findViewById(R.id.Led7);

        Switch led8 = (Switch) findViewById(R.id.Led8);

        Switch led9 = (Switch) findViewById(R.id.Led9);


        Switch servo2 = (Switch) findViewById(R.id.Servo2);

        Switch servo4 = (Switch) findViewById(R.id.Servo4);

        Switch servo5 = (Switch) findViewById(R.id.Servo5);

        Switch servo6 = (Switch) findViewById(R.id.Servo6);

        Switch servo7 = (Switch) findViewById(R.id.Servo7);

        Switch servo8 = (Switch) findViewById(R.id.Servo8);

        Switch servo9 = (Switch) findViewById(R.id.Servo9);


        Switch mq2 = (Switch) findViewById(R.id.Mq2);

        Switch mq4 = (Switch) findViewById(R.id.Mq4);

        Switch mq5 = (Switch) findViewById(R.id.Mq5);

        Switch mq6 = (Switch) findViewById(R.id.Mq6);

        Switch mq7 = (Switch) findViewById(R.id.Mq7);

        Switch mq8 = (Switch) findViewById(R.id.Mq8);

        Switch mq9 = (Switch) findViewById(R.id.Mq9);


        int[] pinLed = {2,4,0,0,0,0,0};

        int[] pinServo = {5,0 , 0, 0, 0,0, 0};

        int[] pinGaz = {6};


        boolean access1 = true;
        boolean access2 = true;
        boolean access3 = true;


        int i = 0;

        int nl=2;

        if (access1==true) {

            while (i !=nl) {


                if (pinLed[i] == 9) {


                    led9.setVisibility(View.VISIBLE);

                    ImageView im19 = (ImageView) findViewById(R.id.imageView19);

                    im19.setVisibility(View.VISIBLE);


                    //SHOW the button


                    i++;
                }

                if (pinLed[i] == 8) {
                    led8.setVisibility(View.VISIBLE);
                    ImageView im16 = (ImageView) findViewById(R.id.imageView16);

                    im16.setVisibility(View.VISIBLE);

                     //SHOW the button
                    i++;
                }

               if (pinLed[i] == 7) {
                    led7.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im13 = (ImageView) findViewById(R.id.imageView13);

                    im13.setVisibility(View.VISIBLE);


                    i++;
                }


                if (pinLed[i] == 6) {



                    led6.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im10 = (ImageView) findViewById(R.id.imageView10);

                    im10.setVisibility(View.VISIBLE);



                    i++;


                }

                if (pinLed[i] == 5) {
                    led5.setVisibility(View.VISIBLE);
                    ImageView im7 = (ImageView) findViewById(R.id.imageView7);

                    im7.setVisibility(View.VISIBLE);




                    i++;



                }





                if (pinLed[i] == 4) {


                    led4.setVisibility(View.VISIBLE); //SHOW the button


                    ImageView im4= (ImageView) findViewById(R.id.imageView4);

                    im4.setVisibility(View.VISIBLE);


                    i++;
                }

                if (pinLed[i] == 2) {
                    led2.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im1 = (ImageView) findViewById(R.id.imageView1);

                    im1.setVisibility(View.VISIBLE);



                    i++;
                }


            }
        }


        int j = 0;
        int ns = 1;


       if (access2==true) {

           while (j != ns) {

                if (pinServo[j] == 2) {
                    servo2.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im2 = (ImageView) findViewById(R.id.imageView2);

                    im2.setVisibility(View.VISIBLE);


                    j++;
                }

                if (pinServo[j] == 4) {
                    servo4.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im5 = (ImageView) findViewById(R.id.imageView5);

                    im5.setVisibility(View.VISIBLE);

                    j++;
                }

                if (pinServo[j] == 5) {

                    servo5.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im8= (ImageView) findViewById(R.id.imageView8);

                    im8.setVisibility(View.VISIBLE);



                    j++;
                }


                if (pinServo[j] == 6) {
                    servo6.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im11 = (ImageView) findViewById(R.id.imageView11);

                    im11.setVisibility(View.VISIBLE);


                    j++;
                }


                if (pinServo[j] == 7) {
                    servo7.setVisibility(View.VISIBLE); //SHOW the button


                    ImageView im14 = (ImageView) findViewById(R.id.imageView14);

                    im14.setVisibility(View.VISIBLE);



                    j++;
                }

                if (pinServo[j] == 8) {

                    servo8.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im17 = (ImageView) findViewById(R.id.imageView17);

                    im17.setVisibility(View.VISIBLE);


                    j++;
                }

                if (pinServo[j] == 9) {
                    servo9.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im20 = (ImageView) findViewById(R.id.imageView20);

                    im20.setVisibility(View.VISIBLE);


                    j++;
                }
            }
          }

            int z = 0;

           if (access3==true)
          {

                if (pinGaz[z] == 2) {
                    mq2.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im3 = (ImageView) findViewById(R.id.imageView3);

                    im3.setVisibility(View.VISIBLE);


                }

                if (pinGaz[z] == 4) {
                    mq4.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im6 = (ImageView) findViewById(R.id.imageView6);

                    im6.setVisibility(View.VISIBLE);




                }

                if (pinGaz[z] == 5) {
                    mq5.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im9 = (ImageView) findViewById(R.id.imageView9);

                    im9.setVisibility(View.VISIBLE);



                }

                if (pinGaz[z] == 6) {
                    mq6.setVisibility(View.VISIBLE); //SHOW the button
                    ImageView im12 = (ImageView) findViewById(R.id.imageView12);

                   im12.setVisibility(View.VISIBLE);


                }

                if (pinGaz[z] == 7) {
                    mq7.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im15 = (ImageView) findViewById(R.id.imageView15);

                    im15.setVisibility(View.VISIBLE);

                }

                if (pinGaz[z] == 8) {
                    mq8.setVisibility(View.VISIBLE); //SHOW the button

                    ImageView im18 = (ImageView) findViewById(R.id.imageView18);

                    im18.setVisibility(View.VISIBLE);





                }

                if (pinGaz[z] == 9) {
                    mq9.setVisibility(View.VISIBLE); //SHOW the button
                    ImageView im21 = (ImageView) findViewById(R.id.imageView21);

                    im21.setVisibility(View.VISIBLE);


                }


            }


            /*******************************************************/
         /*  Set an onclick/onchange listener for every button  */
            /*******************************************************/


            led9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("led9=1");
                    } else {
                        new Background_get().execute("led9=0");
                    }
                }
            });


            led8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("led8=1");
                    } else {
                        new Background_get().execute("led8=0");
                    }
                }
            });


            led7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("led7=1");
                    } else {
                        new Background_get().execute("led7=0");
                    }
                }
            });


            led6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("led6=1");
                    } else {
                        new Background_get().execute("led6=0");
                    }
                }
            });


            led5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("led5=1");
                    } else {
                        new Background_get().execute("led5=0");
                    }
                }
            });


            led4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                    /* Toggle button is led 2 */
                        new Background_get().execute("led4=1");
                    } else {
                        new Background_get().execute("led4=0");
                    }
                }
            });

            led2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                    /* Toggle button is led 2 */
                        new Background_get().execute("led2=1");
                    } else {
                        new Background_get().execute("led2=0");
                    }
                }
            });


            servo2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("servo2=1");
                    } else {
                        new Background_get().execute("servo2=0");
                    }
                }
            });

            servo4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                    /* Switch is servo 4 */
                        new Background_get().execute("servo4=1");
                    } else

                    {
                        new Background_get().execute("servo4=0");
                    }
                }
            });

            servo5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("servo5=1");
                    } else {
                        new Background_get().execute("servo5=0");
                    }
                }
            });


            servo6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("servo6=1");
                    } else {
                        new Background_get().execute("servo6=0");
                    }
                }
            });


            servo7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("servo7=1");
                    } else {
                        new Background_get().execute("servo7=0");
                    }
                }
            });


            servo8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("servo8=1");
                    } else {
                        new Background_get().execute("servo8=0");
                    }
                }
            });


            servo9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("servo9=1");
                    } else {
                        new Background_get().execute("servo9=0");
                    }
                }
            });


            mq2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()

                                           {
                                               public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                      if (isChecked) {
                    /* Switch is servo 2 */
                     new Background_get().execute("mq2=1");
                      } else {
                      new Background_get().execute("mq2=0");
                        }
                        }
                                           }

            );

            mq4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                    /* Switch is servo 2 */
                        new Background_get().execute("mq4=1");
                    } else {
                        new Background_get().execute("mq4=0");
                    }
                }
            });


            mq5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("mq5=1");
                    } else {
                        new Background_get().execute("mq5=0");
                    }
                }
            });


            mq6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("mq6=1");
                    } else {
                        new Background_get().execute("mq6=0");
                    }
                }
            });


            mq7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("mq7=1");
                    } else {
                        new Background_get().execute("mq7=0");
                    }
                }
            });


            mq8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("mq8=1");
                    } else {
                        new Background_get().execute("mq8=0");
                    }
                }
            });


            mq9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        new Background_get().execute("mq9=1");
                    } else {
                        new Background_get().execute("mq9=0");
                    }
                }
            });


        }


            @Override
            public boolean onCreateOptionsMenu (Menu menu){
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_main, menu);
                return true;
            }

            @Override
            public boolean onOptionsItemSelected (MenuItem item){
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_settings) {
                    return true;

                    /***************************
                     *
                     *
                     *
                     *
                     *
                     *
                     *
                     *
                     * **************************/
                }

                return super.onOptionsItemSelected(item);
            }

       /*  This is a background process for connecting      */
      /*   to the arduino server and sending               */
     /*    the GET request withe the added data           */
            /*****************************************************/

            private class Background_get extends AsyncTask<String, Void, String> {
                @Override
                protected String doInBackground(String... params) {
                    try {
                /* Change the IP to the IP you set in the arduino sketch */
                        URL url = new URL("http://192.168.8.106/?" + params[0]);
                        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        StringBuilder result = new StringBuilder();
                        String inputLine;
                        while ((inputLine = in.readLine()) != null)
                            result.append(inputLine).append("\n");

                        in.close();
                        connection.disconnect();
                        return result.toString();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return null;
                }
            }


    }

