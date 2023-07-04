package com.dolla.rxjavatutorialhamalawy;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Dolla";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Observable<Long> cold = Observable.intervalRange(0, 5, 0, 1, TimeUnit.SECONDS); // cold observable
//
//        cold.subscribe(msg -> Log.i(TAG, "output 1: " + msg)); // subscriber 1 (observer)
//
//        sleepForThreeSeconds();
//
//        cold.subscribe(msg -> Log.i(TAG, "output 2: " + msg)); // subscriber 2 (observer)


//        ConnectableObservable<Long> hot = ConnectableObservable.intervalRange(0, 10, 0, 1, TimeUnit.SECONDS).publish(); // hot observable
//        hot.connect(); // connect to start emitting items
//
//        sleepForThreeSeconds();
//        hot.subscribe(msg -> Log.i(TAG, "output 1: " + msg)); // subscriber 1 (observer)
//
//        sleepForThreeSeconds();
//        hot.subscribe(msg -> Log.i(TAG, "output 2: " + msg)); // subscriber 2 (observer)


//        PublishSubject<String> subject = PublishSubject.create(); // hot observable (observer will only receive items emitted after it subscribed)
//        BehaviorSubject<String> subject = BehaviorSubject.create(); // hot observable (observer will receive the last item emitted before it subscribed and all items emitted after it subscribed)
//        ReplaySubject<String> subject = ReplaySubject.create(); // hot observable (observer will receive all items emitted before and after it subscribed)
//        AsyncSubject<String> subject = AsyncSubject.create(); // hot observable (observer will receive only the last item emitted before onComplete)
//
//        subject.subscribe(msg -> Log.i(TAG, "output 1: " + msg)); // subscriber 1 (observer)
//
//        subject.onNext("A"); // emit A to all subscribers (observers)
//        sleepForThreeSeconds();
//        subject.onNext("B"); // emit B to all subscribers (observers)
//        sleepForThreeSeconds();
//        subject.onNext("C"); // emit C to all subscribers (observers)
//        sleepForThreeSeconds();
//        subject.onNext("D"); // emit D to all subscribers (observers)
//        sleepForThreeSeconds();
//
//        subject.subscribe(msg -> Log.i(TAG, "output 2: " + msg)); // subscriber 2 (observer)
//
//        subject.onNext("E"); // emit E to all subscribers (observers)
//        sleepForThreeSeconds();
//        subject.onNext("F"); // emit F to all subscribers (observers)
//        sleepForThreeSeconds();
//        subject.onNext("G"); // emit G to all subscribers (observers)
//        sleepForThreeSeconds();
//
//        subject.onNext("Done"); // emit Done to all subscribers (observers)
//        subject.onComplete(); // complete the observable and emit onComplete to all subscribers (observers)


//        MaybeObserver observer = new MaybeObserver() { // observer (maybe)
//
//            @Override
//            public void onSubscribe(@NonNull Disposable d) { // called when the observer (maybe) is subscribed to the observable
//                // Disposable is used to dispose the observer (maybe) from the observable (to stop receiving items from the observable)
//
//            }
//
//            @Override
//            public void onSuccess(Object o) { // called when the observer (maybe) receives an item from the observable
//
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) { // called when the observer (maybe) receives an error from the observable
//
//            }
//
//            @Override
//            public void onComplete() { // called when the observer (maybe) receives onComplete from the observable
//
//            }
//        };

//        SingleObserver observer = new SingleObserver() { // observer (single)
//
//            @Override
//            public void onSubscribe(@NonNull Disposable d) { // called when the observer (single) is subscribed to the observable
//                // Disposable is used to dispose the observer (single) from the observable (to stop receiving items from the observable)
//
//            }
//
//            @Override
//            public void onSuccess(Object o) { // called when the observer (single) receives an item from the observable
//
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) { // called when the observer (single) receives an error from the observable
//
//            }
//        };

//        CompletableObserver observer = new CompletableObserver() { // observer (completable)
//
//            @Override
//            public void onSubscribe(@NonNull Disposable d) { // called when the observer (completable) is subscribed to the observable
//                // Disposable is used to dispose the observer (completable) from the observable (to stop receiving items from the observable)
//
//            }
//
//            @Override
//            public void onComplete() { // called when the observer (completable) receives onComplete from the observable
//
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) { // called when the observer (completable) receives an error from the observable
//
//            }
//        };


//        Observable observable = Observable.create(new ObservableOnSubscribe<Object>() { // create() method is used to create an observable
//            @Override
//            public void subscribe(@NonNull ObservableEmitter<Object> emitter) throws Exception { // subscribe method is called when the observer (observable / flowable) is subscribed to the observable
//                // ObservableEmitter is used to emit items to the observer (observable / flowable)
//
//                for (int i = 0; i < 10; i++) {
//                    emitter.onNext(i); // emit i to the observer (observable / flowable)
//                    sleepForThreeSeconds();
//                }
//
//                emitter.onComplete(); // complete the observable and emit onComplete to the observer (observable / flowable)
//            }
//        });

//        Observable observable = Observable.just(0, 1, 2, 3, 4, 5, 6, 7, 8, 9); // just() method is used to create an observable and emit items to the observer (observable / flowable)

//        Integer[] list = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // array of items to be emitted to the observer (observable / flowable)
//        Observable observable = Observable.fromArray(list); // fromArray() method is used to create an observable and emit items to the observer (observable / flowable)

//        Observable observable = Observable.range(0, 10); // range() method is used to create an observable and emit items to the observer (observable / flowable)

//        Observable observable = Observable.timer(3, TimeUnit.SECONDS); // timer() method is used to create an observable and emit items to the observer (observable / flowable)
//
//        Observer observer = new Observer() { // observer (observable / flowable) (it also can be any type of the above observers (maybe, single, completable))
//
//            @Override
//            public void onSubscribe(@NonNull Disposable d) { // called when the observer (observable / flowable) is subscribed to the observable
//                // Disposable is used to dispose the observer (observable / flowable) from the observable (to stop receiving items from the observable)
//                Log.d(TAG, "onSubscribe: ");
//            }
//
//            @Override
//            public void onNext(Object o) { // called when the observer (observable / flowable) receives an item from the observable
//                Log.d(TAG, "onNext: " + o);
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) { // called when the observer (observable / flowable) receives an error from the observable
//                Log.d(TAG, "onError: " + e.getMessage());
//            }
//
//            @Override
//            public void onComplete() { // called when the observer (observable / flowable) receives onComplete from the observable
//                Log.d(TAG, "onComplete: ");
//            }
//        };
//
//        observable.subscribe(observer); // subscribe the observer (observable / flowable) to the observable

        Observable.just(1, 2, 3, 4, 5)

                .subscribeOn(Schedulers.io()) // subscribeOn() method is used to subscribe the observer to the observable on a specific thread (io thread)

                .doOnNext(i -> Log.d(TAG, "upStream: " + i + " current Thread: " + Thread.currentThread().getName())) // doOnNext() method is used to do something when the observer (observable / flowable) receives an item from the observable

                .observeOn(AndroidSchedulers.mainThread()) // observeOn() method is used to observe the observer (observable / flowable) on a specific thread (main thread / ui thread)

                .subscribe(j -> Log.d(TAG, "downStream: " + j + " current Thread: " + Thread.currentThread().getName())); // subscribe the observer (observable / flowable) to the observable
    }

    private void sleepForThreeSeconds() {
        try {
            Thread.sleep(3 * 1000L); // 3 * 1000L = 3000ms = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L); // 1000L = 1000ms = 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}