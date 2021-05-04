import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.miprojectomasgrande.R
import com.example.miprojectomasgrande.ruleta.Premio


class PrizeAdapter(val context: Context?, data: List<Premio>) :
    RecyclerView.Adapter<PrizeAdapter.ViewHolder>() {

    private val itemsList: List<Premio> = data

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.view_premio_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val prize = itemsList[position]
        holder.prizeImage.setImageResource(prize.imagen)
        holder.prizeValue.text = prize.recompensa.toString()
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var prizeImage: ImageView = itemView.findViewById(R.id.ivCereza)
        var prizeValue: TextView = itemView.findViewById(R.id.tvCereza)
    }
}