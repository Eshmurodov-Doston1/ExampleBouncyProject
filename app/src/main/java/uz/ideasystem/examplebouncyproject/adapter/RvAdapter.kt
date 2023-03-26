package uz.ideasystem.examplebouncyproject.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.factor.bouncy.BouncyRecyclerView
import uz.ideasystem.examplebouncyproject.databinding.ItemRvBinding
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class RvAdapter(
    private val list: ArrayList<String>
):BouncyRecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(var itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){
        fun onBind(str:String,position:Int){
            val rnd = java.util.Random();
            val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            itemRvBinding.cardItem.setCardBackgroundColor(color)
            itemRvBinding.tv.text = str
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onItemMoved(fromPosition: Int, toPosition: Int) {
        //*****must override to save changes
        //called repeatedly when item is dragged (reordered)

        //example of handling reorder

        //*****must override to save changes
        //called repeatedly when item is dragged (reordered)

        //example of handling reorder

        Collections.swap(list, fromPosition, toPosition)
        notifyItemMoved(fromPosition, toPosition)
    }



    override fun onItemReleased(viewHolder: RecyclerView.ViewHolder) {
        viewHolder.itemView.alpha = 1f
    }

    override fun onItemSelected(viewHolder: RecyclerView.ViewHolder?) {
        viewHolder?.itemView?.alpha = 0.5f
    }

    override fun onItemSwipedToEnd(viewHolder: RecyclerView.ViewHolder, positionOfItem: Int) {
        list[positionOfItem] += "\nswiped to right"
        notifyItemChanged(positionOfItem)
    }

    override fun onItemSwipedToStart(viewHolder: RecyclerView.ViewHolder, positionOfItem: Int) {
        list[positionOfItem] += "\nswiped to left"
        notifyItemChanged(positionOfItem)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }
}