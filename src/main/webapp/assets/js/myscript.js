function saveClient(){
	var nome = $('#nome').val();
	var idade = $('#idade').val();
	var profissao = $('#profissao').val();
	$.ajax({
		url:"/WebProjetc/index/save?nome=" +nome+ "&idade=" +idade+ "&profissao=" +profissao,
		success: function(result){
			alert(result);
		}
	});
}