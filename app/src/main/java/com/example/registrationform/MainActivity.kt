package com.example.registrationform

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.registrationform.ui.theme.RegistrationFormTheme

class MainActivity : ComponentActivity() {
    private lateinit var editFirstName: EditText
    private lateinit var editLastName: EditText
    private lateinit var radioGender: RadioGroup
    private lateinit var editBirthDate: EditText
    private lateinit var editAddress: EditText
    private lateinit var editEmail: EditText
    private lateinit var checkAgreeToTerms: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editFirstName = findViewById(R.id.editFirstName)
        editLastName = findViewById(R.id.editLastName)
        radioGender = findViewById(R.id.radioGender)
        editBirthDate = findViewById(R.id.editBirthDate)
        editAddress = findViewById(R.id.editAddress)
        editEmail = findViewById(R.id.editEmail)
        checkAgreeToTerms = findViewById(R.id.checkAgreeToTerms)

        val registerButton: Button = findViewById(R.id.registerButton)
        registerButton.setOnClickListener {
            // Handle registration logic here
            val firstName = editFirstName.text.toString()
            val lastName = editLastName.text.toString()
            val selectedGender = findViewById<RadioButton>(radioGender.checkedRadioButtonId).text.toString()
            val birthDate = editBirthDate.text.toString()
            val address = editAddress.text.toString()
            val email = editEmail.text.toString()
            val agreeToTerms = checkAgreeToTerms.isChecked

            if (isValidRegistration(firstName, lastName, selectedGender, birthDate, address, email, agreeToTerms)) {

            }
        }
    }

    private fun isValidRegistration(
        firstName: String,
        lastName: String,
        gender: String,
        birthDate: String,
        address: String,
        email: String,
        agreeToTerms: Boolean
    ): Boolean {
        // Implement your validation logic here
        // For example, check if fields are not empty, validate email, and ensure terms are agreed to
        return !firstName.isEmpty() && !lastName.isEmpty() && !gender.isEmpty() && !birthDate.isEmpty() &&
                !address.isEmpty() && !email.isEmpty() && agreeToTerms
    }
}