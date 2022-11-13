<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp"%>
<%@ include file="/inc/sidebar.jsp"%>
<!-- main -->
<div id="layoutSidenav_content">
	<div class="container-fluid px-4">
		<h1 class="mt-4">계좌 관리</h1>
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table me-1"></i> 계좌 리스트
			</div>
			<div class="card-body">
				<table id="datatablesSimple">
					<thead>
						<tr>
							<th>accountNo</th>
							<th>accountNumber</th>
							<th>balance</th>
							<th>createDate</th>
							<th>SupdateDate</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Donna Snider</td>
							<td>Customer Support</td>
							<td>New York</td>
							<td>27</td>
							<td>2011/01/25</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<!-- end main -->
	<%@ include file="/inc/footer.jsp"%>
	</body>
	</html>