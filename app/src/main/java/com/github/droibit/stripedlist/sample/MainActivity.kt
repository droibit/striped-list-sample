package com.github.droibit.stripedlist.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView.VERTICAL
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.list

typealias OnItemClickListener = (String) -> Unit

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    list.also {
      it.adapter = StripedListAdapter1(this, texts) {
        Log.d(TAG, "#onItemClicked(text=$it)")
      }
      it.addItemDecoration(
          DividerItemDecoration(this, VERTICAL)
      )
    }
  }

  companion object {

    private val TAG = MainActivity::class.java.simpleName

    // ref. https://randomwordgenerator.com/
    private val texts = listOf(
        "fail",
        "trustee",
        "innovation",
        "respect",
        "mainstream",
        "glass",
        "vnightmare",
        "press",
        "joint",
        "mature",
        "dome",
        "rain",
        "reservoir",
        "organisation",
        "door",
        "collar",
        "afford",
        "excuse",
        "reliable",
        "frog",
        "marketing",
        "merit",
        "borrow",
        "carriage",
        "improve",
        "computing",
        "vdistortion",
        "vgasp",
        "happen",
        "foundation"
    )

  }
}
