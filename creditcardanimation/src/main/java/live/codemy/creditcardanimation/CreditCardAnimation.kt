package live.codemy.creditcardanimation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.view_credit_card.view.*
import kotlinx.android.synthetic.main.view_credit_card_back.view.*
import kotlinx.android.synthetic.main.view_credit_card_front.view.*

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
        LayoutInflater.from(context).inflate(R.layout.view_credit_card, this)

        btnCVC.setOnClickListener {
            incCreditCardFront.animate()
                .translationY(-(incCreditCardFront as CardView).height.toFloat())
                .alpha(0.0f)
                .duration = 1000

            incCreditCardBack.animate()
                .translationY((incCreditCardBack as CardView).height.toFloat())
                .alpha(1.0f)
                .duration = 1000
        }

        btnFront.setOnClickListener {
            incCreditCardFront.animate()
                .translationY(0f)
                .alpha(1.0f)
                .duration = 1000

            incCreditCardBack.animate()
                .translationY(0f)
                .alpha(0.0f)
                .duration = 1000
        }
    }
}