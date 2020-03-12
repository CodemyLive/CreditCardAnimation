package live.codemy.creditcardanimation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView

class CreditCardAnimation @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(
    context,
    attributeSet,
    defStyleAttr
) {
    init {
        LayoutInflater.from(context).inflate(R.layout.view_credit_card_animation, this)
    }
}