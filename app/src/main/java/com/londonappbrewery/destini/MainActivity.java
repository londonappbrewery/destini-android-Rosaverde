package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mStoryTextView;
    Button mAns1Button;
    Button mAns2Button;
    int mIndex = 1;
    // TODO: Steps 4 & 8 - Declare member variables here:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView.findViewById(R.id.storyTextView);
        mAns1Button.findViewById(R.id.buttonTop);
        mAns2Button.findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAns1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(mIndex == 1 || mIndex == 2)
               {
                   mStoryTextView.setText(R.string.T3_Story);
                   mAns1Button.setText(R.string.T3_Ans1);
                   mAns2Button.setText(R.string.T3_Ans2);
                   mIndex = 3;
               }
               else
               {
                   mStoryTextView.setText(R.string.T6_End);
                   mAns1Button.setVisibility(View.GONE);
                   mAns2Button.setVisibility(View.GONE);
               }

            }
        });

        mAns2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mIndex == 1)
                {
                    mStoryTextView.setText(R.string.T2_Story);
                    mAns1Button.setText(R.string.T2_Ans1);
                    mAns2Button.setText(R.string.T2_Ans2);
                    mIndex = 2;
                }
                else if(mIndex == 2)
                {
                    mStoryTextView.setText(R.string.T4_End);
                    mAns1Button.setVisibility(View.GONE);
                    mAns2Button.setVisibility(View.GONE);
                }
                else
                {
                    mStoryTextView.setText(R.string.T5_End);
                    mAns1Button.setVisibility(View.GONE);
                    mAns2Button.setVisibility(View.GONE);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
