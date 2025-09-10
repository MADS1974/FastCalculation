package br.edu.scl.ifsp.mads.fastcalculation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.edu.scl.ifsp.mads.fastcalculation.Extras.EXTRA_POINTS
import br.edu.scl.ifsp.mads.fastcalculation.databinding.FragmentGameResultBinding

class GameResultFragment : Fragment() {
    private lateinit var fragmentGameResultBinding: FragmentGameResultBinding
    private var points: Float = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            points = it.getFloat(EXTRA_POINTS)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGameResultBinding = FragmentGameResultBinding.inflate(inflater, container, false)

        fragmentGameResultBinding.apply {
            "%.1f".format(points).also {
                pointsTv.text = it
            }

            restartBt.setOnClickListener {
                (context as GameManager).onPlayGame()
            }
        }

        return fragmentGameResultBinding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(points: Float) =
            GameResultFragment().apply {
                arguments = Bundle().apply {
                    putFloat(EXTRA_POINTS, points)
                }
            }
    }
}