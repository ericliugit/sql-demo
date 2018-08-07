package top.apower.sqldemo.model.data;

import java.io.Serializable;

public class ActorFilmDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor_film.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor_film.film_id
     *
     * @mbg.generated
     */
    private String filmId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor_film.actor_id
     *
     * @mbg.generated
     */
    private String actorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table actor_film
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor_film.id
     *
     * @return the value of actor_film.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_film
     *
     * @mbg.generated
     */
    public ActorFilmDO withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor_film.id
     *
     * @param id the value for actor_film.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor_film.film_id
     *
     * @return the value of actor_film.film_id
     *
     * @mbg.generated
     */
    public String getFilmId() {
        return filmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_film
     *
     * @mbg.generated
     */
    public ActorFilmDO withFilmId(String filmId) {
        this.setFilmId(filmId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor_film.film_id
     *
     * @param filmId the value for actor_film.film_id
     *
     * @mbg.generated
     */
    public void setFilmId(String filmId) {
        this.filmId = filmId == null ? null : filmId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor_film.actor_id
     *
     * @return the value of actor_film.actor_id
     *
     * @mbg.generated
     */
    public String getActorId() {
        return actorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_film
     *
     * @mbg.generated
     */
    public ActorFilmDO withActorId(String actorId) {
        this.setActorId(actorId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor_film.actor_id
     *
     * @param actorId the value for actor_film.actor_id
     *
     * @mbg.generated
     */
    public void setActorId(String actorId) {
        this.actorId = actorId == null ? null : actorId.trim();
    }
}