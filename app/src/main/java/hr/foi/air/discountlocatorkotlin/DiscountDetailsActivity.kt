package hr.foi.air.discountlocatorkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import hr.foi.air.database.entities.Discount
import org.w3c.dom.Text
import java.text.SimpleDateFormat

class DiscountDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discount_details)
    }
}
