package com.akirachix.articlescard

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.articlescard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvbookauthors.layoutManager = LinearLayoutManager(this)

        displayBooks()




    }

    fun displayBooks() {
        val article1 = Articles(
            "Born A crime",
            "Trevor Noah",
            "",
            "23/7/2024",
            "Lorem ipsum is a placeholder text commonly used in the publishing and graphic design industries to demonstrate the visual form of a document or a typeface without relying on meaningful content. It originated as a corrupted version of De finibus bonorum et malorum, a 1st-century BC text by the Roman statesman and philosopher Cicero, with words altered, added, and removed to make it nonsensical and improper Latin. The first two words themselves are a truncation of dolorem ipsum (\"pain itself\"). Versions of the Lorem ipsum text have been used in typesetting at least since the 1960s, when it was popularized by advertisements for Letraset transfer sheets. Lorem ipsum was introduced to the digital world in the mid-1980s, when Aldus employed it in graphic and word-processing templates for its desktop publishing program PageMaker. Other popular word processors, including Pages and Microsoft Word, have since adopted Lorem ipsum, as have many LaTeX packages, web content managers such as Joomla and WordPress, and CSS libraries such as Semantic UI 1.",
            ""
        )
        val article2 = Articles(
            "Bared To You",
            "Sylvia Day",
            "",
            "23/5/2024",
            "Lorem ipsum is a placeholder text commonly used in the publishing and graphic design industries to demonstrate the visual form of a document or a typeface without relying on meaningful content. It originated as a corrupted version of De finibus bonorum et malorum, a 1st-century BC text by the Roman statesman and philosopher Cicero, with words altered, added, and removed to make it nonsensical and improper Latin. The first two words themselves are a truncation of dolorem ipsum (\\\"pain itself\\\"). Versions of the Lorem ipsum text have been used in typesetting at least since the 1960s, when it was popularized by advertisements for Letraset transfer sheets. Lorem ipsum was introduced to the digital world in the mid-1980s, when Aldus employed it in graphic and word-processing templates for its desktop publishing program PageMaker. Other popular word processors, including Pages and Microsoft Word, have since adopted Lorem ipsum, as have many LaTeX packages, web content managers such as Joomla and WordPress, and CSS libraries such as Semantic UI 1.",
            ""
        )
        val article3 = Articles(
            "It Ends With Us",
            "Colleen Hover",
            "",
            "21/4/2024",
            "Lorem ipsum is a placeholder text commonly used in the publishing and graphic design industries to demonstrate the visual form of a document or a typeface without relying on meaningful content. It originated as a corrupted version of De finibus bonorum et malorum, a 1st-century BC text by the Roman statesman and philosopher Cicero, with words altered, added, and removed to make it nonsensical and improper Latin. The first two words themselves are a truncation of dolorem ipsum (\\\"pain itself\\\"). Versions of the Lorem ipsum text have been used in typesetting at least since the 1960s, when it was popularized by advertisements for Letraset transfer sheets. Lorem ipsum was introduced to the digital world in the mid-1980s, when Aldus employed it in graphic and word-processing templates for its desktop publishing program PageMaker. Other popular word processors, including Pages and Microsoft Word, have since adopted Lorem ipsum, as have many LaTeX packages, web content managers such as Joomla and WordPress, and CSS libraries such as Semantic UI 1.",
            ""
        )
        val  articleList= listOf(article1,article2,article3)
        val articlesAdapter=ArticlesAdapter(articleList)
        binding.rvbookauthors.adapter=articlesAdapter
    }
}
