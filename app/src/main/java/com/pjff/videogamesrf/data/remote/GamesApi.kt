package com.pjff.videogamesrf.data.remote

import com.pjff.videogamesrf.data.remote.model.GameDetailDto
import com.pjff.videogamesrf.data.remote.model.GameDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface GamesApi {

    @GET
    fun getGames(
        @Url url: String?
    ): Call<List<GameDto>>
    //getGames("cm/games/games_list.php")

    //Conexion para los detalles ,ponemos el enpoint a cual conectarnos
    @GET("cm/games/game_detail.php")
    fun getGameDetail(
        @Query("id") id: String?/*,
        //PARA PODER PASAR MAS PARAMETROS
        @Query("name") name: String?*/
    ): Call<GameDetailDto>
    //getGameDetail("21347","amaury")
    //cm/games/game_detail.php?id=21347&name=amaury

    //---------------------------Para Apiary-PRACTICA 2

    @GET("games/games_list")
    fun getGamesApiary(): Call<List<GameDto>>

    //Enpoint que quiero consumir

    //games/game_detail/21357
    @GET("games/game_detail/{id}")
    fun getGameDetailApiary(
        @Path("id") id: String?/*,
        @Path("name") name: String?*/
    ): Call<GameDetailDto>

    //getGameDetailApiary("21357","Amaury")
    //games/game_detail/21347/Amaury




}