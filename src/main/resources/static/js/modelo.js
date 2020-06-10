
$(document).ready(function(){

    $('.nBtn').show();
    $('#div1').hide();

    $('.nBtn, .table .eBtn').on('click',function(event){

        event.preventDefault();

        var href = $(this).attr('href');
        var text = $(this).text();

        var text = $(this).text();

        $('#div1').show();
        $('.nBtn').hide();

        if (text == 'Edit'){

            $.get(href,function(modelo,status){

                $('#bForm #id').val(modelo.id);
                $('#bForm #marca_id').val(modelo.marca_id.id).change().focus();
                $('#bForm #nome').val(modelo.nome);
                $('#bForm #descricao').val(modelo.descricao);
                $('#bForm #ano').val(modelo.ano);

                 $("html, body").animate({
                     scrollTop: 0
                 });

            });

        } else {

            $('#bForm #id').val('');
            $('#bForm #marca_id').val('');
            $('#bForm #nome').val('');
            $('#bForm #descricao').val('');
            $('#bForm #ano').val('');

        }
    });

    $('.table .delBtn').on('click',function (event) {
         event.preventDefault();
         var href = $(this).attr('href');

         $('#divM #delRef').attr('href', href);
         $('#divM').modal();
    });

});