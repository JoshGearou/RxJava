package com.example.rxjava;


import androidx.core.util.Pair;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class RxJavaExamples {

    public static Observable<Integer> riddleOne(int val) {
        return Observable.just(val);
    }

    public static Observable<Integer> riddle2(Observable<Integer> val) {
        return val.map(x -> x+1);
    }

    public static Observable<Integer> riddle3(Observable<Integer> val) {
        return val.filter(x -> x % 2 == 0);
    }

    public static Observable<Boolean> riddle4(Observable<Void> val) {
        return val.scan(false, (x, y) -> !x);
    }

    public static Observable<Integer> riddle5(Observable<Integer> first, Observable<Integer> second) {
        return Observable.combineLatest(first, second, (x,y) -> x+y);
    }

    public static Single<Pair<Integer, Integer>> riddle6(Single<Integer> first, Single<Integer> second) {
        return Single.zip(first, second, (x, y) -> new Pair<>(x, y));
    }
}
