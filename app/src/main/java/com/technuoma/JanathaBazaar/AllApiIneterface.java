package com.technuoma.JanathaBazaar;

import com.technuoma.JanathaBazaar.addressPOJO.addressBean;
import com.technuoma.JanathaBazaar.cartPOJO.cartBean;
import com.technuoma.JanathaBazaar.checkPromoPOJO.checkPromoBean;
import com.technuoma.JanathaBazaar.checkoutPOJO.checkoutBean;
import com.technuoma.JanathaBazaar.homePOJO.homeBean;
import com.technuoma.JanathaBazaar.orderDetailsPOJO.orderDetailsBean;
import com.technuoma.JanathaBazaar.ordersPOJO.ordersBean;
import com.technuoma.JanathaBazaar.productsPOJO.productsBean;
import com.technuoma.JanathaBazaar.searchPOJO.searchBean;
import com.technuoma.JanathaBazaar.seingleProductPOJO.singleProductBean;
import com.technuoma.JanathaBazaar.subCat1POJO.subCat1Bean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface AllApiIneterface {


    @GET("janathabazaar/api/getHome.php")
    Call<homeBean> getHome();

    @Multipart
    @POST("janathabazaar/api/getSubCat1.php")
    Call<subCat1Bean> getSubCat1(
            @Part("cat") String cat
    );

    @Multipart
    @POST("janathabazaar/api/getSubCat2.php")
    Call<subCat1Bean> getSubCat2(
            @Part("subcat1") String cat
    );

    @Multipart
    @POST("janathabazaar/api/getOrderId.php")
    Call<payBean> getOrderId(
            @Part("amount") String amount,
            @Part("receipt") String receipt
    );

    @Multipart
    @POST("janathabazaar/api/getProducts.php")
    Call<productsBean> getProducts(
            @Part("subcat2") String cat
    );

    @Multipart
    @POST("janathabazaar/api/getProductById.php")
    Call<singleProductBean> getProductById(
            @Part("id") String cat
    );

    @Multipart
    @POST("janathabazaar/api/search.php")
    Call<searchBean> search(
            @Part("query") String query
    );

    @Multipart
    @POST("janathabazaar/api/login.php")
    Call<loginBean> login(
            @Part("phone") String phone,
            @Part("token") String token
    );

    @Multipart
    @POST("janathabazaar/api/verify.php")
    Call<loginBean> verify(
            @Part("phone") String phone,
            @Part("otp") String otp
    );

    @Multipart
    @POST("janathabazaar/api/addCart.php")
    Call<singleProductBean> addCart(
            @Part("user_id") String user_id,
            @Part("product_id") String product_id,
            @Part("quantity") String quantity,
            @Part("unit_price") String unit_price,
            @Part("version") String version
    );

    @Multipart
    @POST("janathabazaar/api/updateCart.php")
    Call<singleProductBean> updateCart(
            @Part("id") String id,
            @Part("quantity") String quantity,
            @Part("unit_price") String unit_price
    );

    @Multipart
    @POST("janathabazaar/api/deleteCart.php")
    Call<singleProductBean> deleteCart(
            @Part("id") String id
    );

    @Multipart
    @POST("janathabazaar/api/getRew.php")
    Call<String> getRew(
            @Part("user_id") String user_id
    );

    @Multipart
    @POST("janathabazaar/api/clearCart.php")
    Call<singleProductBean> clearCart(
            @Part("user_id") String user_id
    );

    @Multipart
    @POST("janathabazaar/api/getOrderDetails.php")
    Call<orderDetailsBean> getOrderDetails(
            @Part("order_id") String order_id
    );

    @Multipart
    @POST("janathabazaar/api/getCart.php")
    Call<cartBean> getCart(
            @Part("user_id") String user_id
    );

    @Multipart
    @POST("janathabazaar/api/getOrders.php")
    Call<ordersBean> getOrders(
            @Part("user_id") String user_id
    );

    @Multipart
    @POST("janathabazaar/api/getAddress.php")
    Call<addressBean> getAddress(
            @Part("user_id") String user_id
    );

    @Multipart
    @POST("janathabazaar/api/deleteAddress.php")
    Call<addressBean> deleteAddress(
            @Part("id") String id
    );

    @Multipart
    @POST("janathabazaar/api/checkPromo.php")
    Call<checkPromoBean> checkPromo(
            @Part("promo") String promo,
            @Part("user_id") String user_id
    );

    @Multipart
    @POST("janathabazaar/api/buyVouchers.php")
    Call<checkoutBean> buyVouchers(
            @Part("user_id") String user_id,
            @Part("amount") String amount,
            @Part("txn") String txn,
            @Part("name") String name,
            @Part("address") String address,
            @Part("pay_mode") String pay_mode,
            @Part("slot") String slot,
            @Part("date") String date,
            @Part("promo") String promo,
            @Part("house") String house,
            @Part("area") String area,
            @Part("city") String city,
            @Part("pin") String pin,
            @Part("isnew") String isnew
    );
}
