
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

            $.get(href,function(marca,status){

                $('#bForm #id').val(marca.id);
                $('#bForm #nome').val(marca.nome);
                $('#bForm #pais_id').val(marca.pais_id.id).change();
                $('#bForm #ano').val(marca.ano);
            });

        } else {

            $('#bForm #id').val('');
            $('#bForm #nome').val('');
            $('#bForm #pais_id').val('');
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