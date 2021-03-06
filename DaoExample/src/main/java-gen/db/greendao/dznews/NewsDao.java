package db.greendao.dznews;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import db.greendao.dznews.News;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "NEWS".
*/
public class NewsDao extends AbstractDao<News, Long> {

    public static final String TABLENAME = "NEWS";

    /**
     * Properties of entity News.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Article_id = new Property(1, Integer.class, "article_id", false, "ARTICLE_ID");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Date = new Property(3, String.class, "date", false, "DATE");
        public final static Property Intro = new Property(4, String.class, "intro", false, "INTRO");
        public final static Property Topic = new Property(5, String.class, "topic", false, "TOPIC");
        public final static Property View_num = new Property(6, Integer.class, "view_num", false, "VIEW_NUM");
        public final static Property Comment_num = new Property(7, Integer.class, "comment_num", false, "COMMENT_NUM");
        public final static Property Source = new Property(8, String.class, "source", false, "SOURCE");
        public final static Property Source_link = new Property(9, String.class, "source_link", false, "SOURCE_LINK");
        public final static Property Hot = new Property(10, Integer.class, "hot", false, "HOT");
        public final static Property Pushed = new Property(11, Integer.class, "pushed", false, "PUSHED");
    };


    public NewsDao(DaoConfig config) {
        super(config);
    }
    
    public NewsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"NEWS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ARTICLE_ID\" INTEGER," + // 1: article_id
                "\"TITLE\" TEXT," + // 2: title
                "\"DATE\" TEXT," + // 3: date
                "\"INTRO\" TEXT," + // 4: intro
                "\"TOPIC\" TEXT," + // 5: topic
                "\"VIEW_NUM\" INTEGER," + // 6: view_num
                "\"COMMENT_NUM\" INTEGER," + // 7: comment_num
                "\"SOURCE\" TEXT," + // 8: source
                "\"SOURCE_LINK\" TEXT," + // 9: source_link
                "\"HOT\" INTEGER," + // 10: hot
                "\"PUSHED\" INTEGER);"); // 11: pushed
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"NEWS\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, News entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer article_id = entity.getArticle_id();
        if (article_id != null) {
            stmt.bindLong(2, article_id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(4, date);
        }
 
        String intro = entity.getIntro();
        if (intro != null) {
            stmt.bindString(5, intro);
        }
 
        String topic = entity.getTopic();
        if (topic != null) {
            stmt.bindString(6, topic);
        }
 
        Integer view_num = entity.getView_num();
        if (view_num != null) {
            stmt.bindLong(7, view_num);
        }
 
        Integer comment_num = entity.getComment_num();
        if (comment_num != null) {
            stmt.bindLong(8, comment_num);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(9, source);
        }
 
        String source_link = entity.getSource_link();
        if (source_link != null) {
            stmt.bindString(10, source_link);
        }
 
        Integer hot = entity.getHot();
        if (hot != null) {
            stmt.bindLong(11, hot);
        }
 
        Integer pushed = entity.getPushed();
        if (pushed != null) {
            stmt.bindLong(12, pushed);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public News readEntity(Cursor cursor, int offset) {
        News entity = new News( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // article_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // date
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // intro
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // topic
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // view_num
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // comment_num
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // source
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // source_link
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // hot
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11) // pushed
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, News entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setArticle_id(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIntro(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTopic(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setView_num(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setComment_num(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setSource(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setSource_link(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setHot(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setPushed(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(News entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(News entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
