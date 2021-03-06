package com.tbg.pixtr.model.api;


import com.tbg.pixtr.model.pojo.collection_images.CollectionDetailsPojo;
import com.tbg.pixtr.model.pojo.collections.CollectionsPojo;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Created by kausthubhadhikari on 29/05/17.
 */

public interface NetworkingInterface {

    @GET("/users/pixtr/collections")
    Observable<List<CollectionsPojo>> getCollections(@QueryMap Map<String, String> options);

    @GET("/collections/{collection_id}/photos")
    Observable<List<CollectionDetailsPojo>> getCollectionPhotos(@Path("collection_id") String collectionId, @QueryMap Map<String, String> options);

}
