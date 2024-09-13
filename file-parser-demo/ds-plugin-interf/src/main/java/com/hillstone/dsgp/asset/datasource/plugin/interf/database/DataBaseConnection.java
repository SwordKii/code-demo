package com.hillstone.dsgp.asset.datasource.plugin.interf.database;

import com.hillstone.dsgp.asset.datasource.plugin.interf.common.DataSourceConnection;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.ExecutionException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.dto.CatalogArchitecture;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.dto.ColumnArchitecture;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.dto.SchemaArchitecture;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.dto.TableArchitecture;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.qo.SchemaNameQO;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.qo.TableNameQO;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.dto.AccountInfo;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.dto.PrivilegeInfo;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.qo.AccountQO;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.sampling.entity.dto.DataBaseSampleData;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.sampling.entity.qo.SamplingParam;

import java.util.List;

/**
 * 数据库类连接抽象类
 *
 * @author wangjian2
 * @date 2024/3/11 20:35
 */
public interface DataBaseConnection extends DataSourceConnection {

    /**
     * 获取catalog信息
     * <p>catalogs为空, 则返回所有catalog信息</p>
     *
     * @param catalogs
     * @return
     * @throws ExecutionException
     */
    List<CatalogArchitecture> getCatalogs(List<String> catalogs) throws ExecutionException;

    /**
     * 获取指定catalog下的schema信息
     * <p>传入catalogs为空, 则返回emptyList</p>
     *
     * @param catalogs
     * @return
     * @throws ExecutionException
     */
    List<SchemaArchitecture> getSchemasByCatalogs(List<String> catalogs) throws ExecutionException;

    /**
     * 获取schema信息
     * <p>schema层不存在时，传入schemas为空, 则返回所有schema信息</p>
     *
     * @param schemas
     * @return
     * @throws ExecutionException
     */
    List<SchemaArchitecture> getSchemas(List<SchemaNameQO> schemas) throws ExecutionException;

    /**
     * 获取指定schema下的table信息
     * <p>传入schemas为空, 则返回emptyList</p>
     *
     * @param schemas
     * @return
     * @throws ExecutionException
     */
    List<TableArchitecture> getTablesBySchemas(List<SchemaNameQO> schemas) throws ExecutionException;

    /**
     * 获取table信息
     * <p>table层不存在时，传入tables为空, 则返回所有table信息</p>
     *
     * @param tables
     * @return
     * @throws ExecutionException
     */
    List<TableArchitecture> getTables(List<TableNameQO> tables) throws ExecutionException;

    /**
     * 获取指定table下的column信息
     * <p>传入tables为空, 则返回emptyList</p>
     *
     * @param tables
     * @return
     * @throws ExecutionException
     */
    List<ColumnArchitecture> getColumnsByTables(List<TableNameQO> tables) throws ExecutionException;

    /**
     * 获取所有账号信息
     *
     * @return
     * @throws ExecutionException
     */
    List<AccountInfo> getUsers() throws ExecutionException;

    /**
     * 获取所有角色信息
     *
     * @return
     * @throws ExecutionException
     */
    List<AccountInfo> getRoles() throws ExecutionException;

    /**
     * 获取指定用户权限信息
     * <p>accounts为空, 则返回所有用户权限信息</p>
     *
     * @param users
     * @return
     * @throws ExecutionException
     */
    List<PrivilegeInfo> getPrivilegesByUsers(List<AccountQO> users) throws ExecutionException;

    /**
     * 获取指定角色权限信息
     * <p>accounts为空, 则返回所有角色权限信息</p>
     *
     * @param roles
     * @return
     * @throws ExecutionException
     */
    List<PrivilegeInfo> getPrivilegesByRoles(List<AccountQO> roles) throws ExecutionException;

    /**
     * 采样数据
     *
     * @param samplingParam
     * @return
     * @throws ExecutionException
     */
    List<DataBaseSampleData> samplingData(SamplingParam samplingParam) throws ExecutionException;
}
