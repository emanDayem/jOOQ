/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.8.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCollation extends TableImpl<Record> {

	private static final long serialVersionUID = 39183355;

	/**
	 * The reference instance of <code>pg_catalog.pg_collation</code>
	 */
	public static final PgCollation PG_COLLATION = new PgCollation();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_collation.collname</code>.
	 */
	public final TableField<Record, String> COLLNAME = createField("collname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_collation.collnamespace</code>.
	 */
	public final TableField<Record, Long> COLLNAMESPACE = createField("collnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_collation.collowner</code>.
	 */
	public final TableField<Record, Long> COLLOWNER = createField("collowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_collation.collencoding</code>.
	 */
	public final TableField<Record, Integer> COLLENCODING = createField("collencoding", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_collation.collcollate</code>.
	 */
	public final TableField<Record, String> COLLCOLLATE = createField("collcollate", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_collation.collctype</code>.
	 */
	public final TableField<Record, String> COLLCTYPE = createField("collctype", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * Create a <code>pg_catalog.pg_collation</code> table reference
	 */
	public PgCollation() {
		this("pg_collation", null);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_collation</code> table reference
	 */
	public PgCollation(String alias) {
		this(alias, PG_COLLATION);
	}

	private PgCollation(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private PgCollation(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, PgCatalog.PG_CATALOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgCollation as(String alias) {
		return new PgCollation(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PgCollation rename(String name) {
		return new PgCollation(name, null);
	}
}
