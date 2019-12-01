package se.emilsjolander.androidx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import se.emilsjolander.androidx.fragment.PlusOneFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var transaction = supportFragmentManager.beginTransaction()
        var fragment = PlusOneFragment.newInstance(1)
        transaction.add(R.id.container, fragment).commit()
        transaction.setMaxLifecycle(fragment, Lifecycle.State.STARTED)

    }
}
