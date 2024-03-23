package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.sql.Wrapper;

public class MainActivity extends AppCompatActivity {

    //leftside of edit text
    private EditText editText10,editText20,editText30,editText40,editText50,editText60,editText70,editText80,editText90;
    //right side of edit text
    private EditText editText11,editText21,editText31,editText41,editText51,editText61,editText71,editText81,editText91;
    //check user input state
    private boolean iseditText10ChangedByUser = true;
    private boolean iseditText11ChangedByUser = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define edit text

        editText10 = findViewById(R.id.editText10);
        editText20 = findViewById(R.id.editText20);
        editText30 = findViewById(R.id.editText30);
        editText40 = findViewById(R.id.editText40);
        editText50 = findViewById(R.id.editText50);
        editText60 = findViewById(R.id.editText60);
        editText70 = findViewById(R.id.editText70);
        editText80 = findViewById(R.id.editText80);
        editText90 = findViewById(R.id.editText90);

        editText11 = findViewById(R.id.editText11);
        editText21 = findViewById(R.id.editText21);
        editText31 = findViewById(R.id.editText31);
        editText41 = findViewById(R.id.editText41);
        editText51 = findViewById(R.id.editText51);
        editText61 = findViewById(R.id.editText61);
        editText71 = findViewById(R.id.editText71);
        editText81 = findViewById(R.id.editText81);
        editText91 = findViewById(R.id.editText91);

        //call add text changed listener to call the function when user give the input for all edittext

        editText10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText10ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(inchesToCentimeters(input));
                        iseditText11ChangedByUser = false; // Prevent infinite loop
                        editText11.setText(output);
                        iseditText11ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                        Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText11ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(centimetersToInches(input));
                        iseditText10ChangedByUser = false; // Prevent infinite loop
                        editText10.setText(output);
                        iseditText10ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText10ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(feetToCentimeters(input));
                        iseditText11ChangedByUser = false; // Prevent infinite loop
                        editText21.setText(output);
                        iseditText11ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText11ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(centimetersToFeet(input));
                        iseditText10ChangedByUser = false; // Prevent infinite loop
                        editText20.setText(output);
                        iseditText10ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText30.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText10ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(yardsToCentimeters(input));
                        iseditText11ChangedByUser = false; // Prevent infinite loop
                        editText31.setText(output);
                        iseditText11ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText31.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText11ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(centimetersToYards(input));
                        iseditText10ChangedByUser = false; // Prevent infinite loop
                        editText30.setText(output);
                        iseditText10ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText40.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText10ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(milesToKilometers(input));
                        iseditText11ChangedByUser = false; // Prevent infinite loop
                        editText41.setText(output);
                        iseditText11ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText41.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText11ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(kilometersToMiles(input));
                        iseditText10ChangedByUser = false; // Prevent infinite loop
                        editText40.setText(output);
                        iseditText10ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText50.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText10ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(poundsToKilograms(input));
                        iseditText11ChangedByUser = false; // Prevent infinite loop
                        editText51.setText(output);
                        iseditText11ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText51.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText11ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(kilogramsToPounds(input));
                        iseditText10ChangedByUser = false; // Prevent infinite loop
                        editText50.setText(output);
                        iseditText10ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText60.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText10ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(ouncesToGrams(input));
                        iseditText11ChangedByUser = false; // Prevent infinite loop
                        editText61.setText(output);
                        iseditText11ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText61.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText11ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(gramsToOunces(input));
                        iseditText10ChangedByUser = false; // Prevent infinite loop
                        editText60.setText(output);
                        iseditText10ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText70.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText10ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(tonsToKilograms(input));
                        iseditText11ChangedByUser = false; // Prevent infinite loop
                        editText71.setText(output);
                        iseditText11ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText71.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText11ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(kilogramsToTons(input));
                        iseditText10ChangedByUser = false; // Prevent infinite loop
                        editText70.setText(output);
                        iseditText10ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText80.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText10ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(celsiusToFahrenheit(input));
                        iseditText11ChangedByUser = false; // Prevent infinite loop
                        editText81.setText(output);
                        iseditText11ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText81.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText11ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(fahrenheitToCelsius(input));
                        iseditText10ChangedByUser = false; // Prevent infinite loop
                        editText80.setText(output);
                        iseditText10ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText90.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText10ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(celsiusToKelvin(input));
                        iseditText11ChangedByUser = false; // Prevent infinite loop
                        editText91.setText(output);
                        iseditText11ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText91.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (iseditText11ChangedByUser) {
                    // Text change is initiated by the user
                    try {
                        double input = Double.parseDouble(charSequence.toString());
                        String output = String.valueOf(kelvinToCelsius(input));
                        iseditText10ChangedByUser = false; // Prevent infinite loop
                        editText90.setText(output);
                        iseditText10ChangedByUser = true; // Reset flag
                    } catch (NumberFormatException e) {
                         Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        
    }
    // Length Conversions
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }
    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static double feetToCentimeters(double feet) {
        return feet * 30.48;
    }
    public static double centimetersToFeet(double centimeters) {
        return centimeters / 30.48;
    }

    public static double yardsToCentimeters(double yards) {
        return yards * 91.44;
    }
    public static double centimetersToYards(double centimeters) {
        return centimeters / 91.44;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    // Weight Conversions
    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double ouncesToGrams(double ounces) {
        return ounces * 28.3495;
    }

    public static double tonsToKilograms(double tons) {
        return tons * 907.185;
    }
    public static double kilogramsToPounds(double kilograms) {
        return kilograms / 0.453592;
    }

    public static double gramsToOunces(double grams) {
        return grams / 28.3495;
    }

    public static double kilogramsToTons(double kilograms) {
        return kilograms / 907.185;
    }

    // Temperature Conversions
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}

