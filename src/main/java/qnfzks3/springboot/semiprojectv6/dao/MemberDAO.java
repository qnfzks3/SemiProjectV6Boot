package qnfzks3.springboot.semiprojectv6.dao;

import qnfzks3.springboot.semiprojectv6.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
