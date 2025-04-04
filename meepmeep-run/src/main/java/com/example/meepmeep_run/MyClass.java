package com.example.meepmeep_run;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;


public class MyClass {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .build();

        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(-10, 61.5, Math.toRadians(270)))
                .lineToY(33)
                .setReversed(true)

                .splineToLinearHeading(new Pose2d(-35,40 ,Math.toRadians(270)), Math.toRadians(270))
                .splineToLinearHeading(new Pose2d(-35,14, Math.toRadians(270)), Math.toRadians(270))
                .splineToLinearHeading(new Pose2d(-45,12, Math.toRadians(270)), Math.toRadians(270))
                .setReversed(true)
                .setReversed(false)
                //delete the above to test true continuity, basically let the tangent be reversed the whole time
                .splineToLinearHeading(new Pose2d(-45,50, Math.toRadians(270)), Math.toRadians(270))
                .splineToLinearHeading(new Pose2d(-45,14, Math.toRadians(270)), Math.toRadians(270))
                .splineToLinearHeading(new Pose2d(-55,12, Math.toRadians(270)), Math.toRadians(270))
                .setReversed(true)
                .setReversed(false)

                .splineToLinearHeading(new Pose2d(-55,50, Math.toRadians(270)), Math.toRadians(270))


                .splineToLinearHeading(new Pose2d(-55,14, Math.toRadians(270)), Math.toRadians(270))
                .splineToLinearHeading(new Pose2d(-61,12, Math.toRadians(270)), Math.toRadians(270))
                .setReversed(true)

                .splineToLinearHeading(new Pose2d(-61,50, Math.toRadians(270)), Math.toRadians(270))





                ////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////
                .strafeToLinearHeading(new Vector2d(-35,61.5), Math.toRadians(270))
                .strafeToLinearHeading(new Vector2d(-2,35), Math.toRadians(270))
////////////////////////////////////////////////////////////////////////////////////////
                .strafeToLinearHeading(new Vector2d(-35,61.5), Math.toRadians(270))
                .strafeToLinearHeading(new Vector2d(-2,35), Math.toRadians(270))
////////////////////////////////////////////////////////////////////////////////////////
                .strafeToLinearHeading(new Vector2d(-35,61.5), Math.toRadians(270))
                .strafeToLinearHeading(new Vector2d(-2,35), Math.toRadians(270))
////////////////////////////////////////////////////////////////////////////////////////
                .strafeToLinearHeading(new Vector2d(-35,61.5), Math.toRadians(270))
                .strafeToLinearHeading(new Vector2d(-2,35), Math.toRadians(270))
////////////////////////////////////////////////////////////////////////////////////////
                .strafeToLinearHeading(new Vector2d(-35,61.5), Math.toRadians(270))
                .strafeToLinearHeading(new Vector2d(-2,35), Math.toRadians(270))
                .strafeToLinearHeading(new Vector2d(-35,61.5), Math.toRadians(270))




                .build());


        meepMeep.setBackground(MeepMeep.Background.FIELD_INTO_THE_DEEP_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}