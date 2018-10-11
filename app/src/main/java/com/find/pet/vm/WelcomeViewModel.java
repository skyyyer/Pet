package com.find.pet.vm;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.databinding.ObservableField;
import android.os.CountDownTimer;

import com.find.pet.ui.activity.LoginActivity;
import com.find.pet.ui.activity.MainActivity;
import com.find.pet.ui.activity.WelcomeActivity;
import com.find.pet.utils.RetrofitClient;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.http.BaseResponse;
import me.goldze.mvvmhabit.http.ResponseThrowable;
import me.goldze.mvvmhabit.utils.RxUtils;
import me.goldze.mvvmhabit.utils.ToastUtils;

public class WelcomeViewModel extends BaseViewModel {

    //计时器
    private CountDownTimer count = new CountDownTimer(5 * 1000, 1000) {
        @Override
        public void onFinish() {
            cancel();
            startActivity(MainActivity.class);
            ((Activity) context).finish();
        }

        @Override
        public void onTick(long millisUntilFinished) {

        }
    };

    public WelcomeViewModel(android.content.Context context) {
        super(context);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        requestNetWork();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        count.cancel();
    }

    public BindingCommand JumpOnClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            startActivity(LoginActivity.class);
            ((Activity) context).finish();
        }
    });

    @SuppressLint("CheckResult")
    private void requestNetWork() {
        count.start();
//        RetrofitClient.getInstance().create(DemoApiService.class)
//                .demoGet()
//                .compose(RxUtils.bindToLifecycle(context)) //请求与View周期同步
//                .compose(RxUtils.schedulersTransformer()) //线程调度
//                .compose(RxUtils.exceptionTransformer()) // 网络错误的异常转换, 这里可以换成自己的ExceptionHandle
//                .doOnSubscribe(new Consumer<Disposable>() {
//                    @Override
//                    public void accept(Disposable disposable) throws Exception {
//                        showDialog();
//                    }
//                })
//                .subscribe(new Consumer<BaseResponse<DemoEntity>>() {
//                    @Override
//                    public void accept(BaseResponse<DemoEntity> response) throws Exception {
//                        //关闭对话框
//                        dismissDialog();
//                        //请求成功
//                        if (response.getCode() == 1) {
//
//                        } else {
//                            //code错误时也可以定义Observable回调到View层去处理
//                            ToastUtils.showShort("数据错误");
//                        }
//                    }
//                }, new Consumer<ResponseThrowable>() {
//                    @Override
//                    public void accept(ResponseThrowable throwable) throws Exception {
//                        dismissDialog();
//                        ToastUtils.showShort(throwable.message);
//                        throwable.printStackTrace();
//                    }
//                });
    }
}
