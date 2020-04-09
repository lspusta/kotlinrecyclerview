package itkido.me.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val titleArrayList: ArrayList<String> = ArrayList()
    val imageArrayList : ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview);

        addItems()

    }

    fun addItems() {
        titleArrayList.add("test1")
        imageArrayList.add("https://cdn.pixabay.com/photo/2020/04/01/12/46/city-4991094_1280.jpg")
        titleArrayList.add("test2")
        imageArrayList.add("https://cdn.pixabay.com/photo/2020/03/27/09/29/waterfall-4973028_1280.jpg")
        setUpRecyclerView()
    }

    fun setUpRecyclerView(){
        recyclerview.layoutManager = LinearLayoutManager(this)

        // Access the RecyclerView Adapter and load the data into it
        recyclerview.adapter = Adapter(titleArrayList, imageArrayList, this)
    }
}
