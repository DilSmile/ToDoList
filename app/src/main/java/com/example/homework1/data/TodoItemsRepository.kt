import android.content.Context
import androidx.appcompat.content.res.AppCompatResources
import com.example.homework1.R
import com.example.homework1.data.TodoItem

class TodoItemsRepository(private val context: Context) {

    fun generateList(size: Int): List<TodoItem> {
        val list = ArrayList<TodoItem>()

        val errorImage = AppCompatResources.getDrawable(context, R.drawable.error)
        val checkBox = "Купить что то"

        for (i in 0 until size) {
            val item = TodoItem(1, errorImage, checkBox)
            list += item
        }
        return list
    }
}
