package com.state;

/**
 * @desc :允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类
 * 使用 Context 来查看当状态 State 改变时的行为变化。
 * @author: zhoushengwen
 * @date: 2020/9/2
 **/
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
