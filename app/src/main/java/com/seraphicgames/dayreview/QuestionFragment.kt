package com.seraphicgames.dayreview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.res.Resources;
import androidx.databinding.Bindable
import androidx.databinding.BindingMethod
import java.util.ResourceBundle;
import androidx.databinding.DataBindingUtil
import com.seraphicgames.dayreview.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {
    var questions: Array<String>? = null
    private var currentQuestion: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentQuestionBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_question, container, false)
        questions = context?.resources?.getStringArray(R.array.questions)
        binding.game = this;
        print(questions)
        binding.invalidateAll()
        return binding.root
    }
}